package com.i2icellcelly.DGW.Business;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import com.i2icellcelly.DGW.Common.DGWLogger;
import com.i2icellcelly.DGW.DataAccess.ISubscriberDal;
import com.i2icellcelly.DGW.DataAccess.RestSubscriberDal;
import com.i2icellcelly.DGW.Entities.AkkaTrafficSenderActor;
import com.i2icellcelly.DGW.Entities.SubscriberMessage;
import com.i2icellcelly.DGW.Entities.SubscriberMessageFactory;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Date;

@Service
public class SubscriberService implements ISubscriberService{

    ISubscriberDal subscriberDal = new RestSubscriberDal();
    String senderMSISDN;
    String receiverMSISDN;

    @Override
    public void generateTraffic(int messageType) {
        SubscriberMessage subsMessage = generateMessage(messageType);

        Config config = ConfigFactory.parseFile(new File("actor.conf"));
        final ActorSystem system = ActorSystem.create("MySystem", config);

        final ActorRef publisher = system.actorOf(AkkaTrafficSenderActor.props(), "publisher");

        publisher.tell(subsMessage.toString(), publisher);
    }

    public SubscriberMessage generateMessage (int messageType){
        DGWLogger.printInfoLogs("Generating new message in business layer, message type: " + messageType);
        SubscriberMessage subsMessage = SubscriberMessageFactory.create(messageType);

        senderMSISDN = subscriberDal.getRandomSubscriber();
        receiverMSISDN = subscriberDal.getRandomSubscriber();

        //In case same MSISDN returns
        while (senderMSISDN.equals(receiverMSISDN)){
            receiverMSISDN = subscriberDal.getRandomSubscriber();
        }

        subsMessage.setSenderMSISDN(senderMSISDN);
        subsMessage.setReceiverMSISDN(receiverMSISDN);

        //generate random dates here
        subsMessage.setStartDate(new Date());
        subsMessage.setEndDate(new Date());

        return subsMessage;
    }
}

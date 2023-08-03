package com.i2icellcelly.DGW.Business;

import com.i2icellcelly.DGW.DataAccess.ISubscriberDal;
import com.i2icellcelly.DGW.DataAccess.RestSubscriberDal;
import com.i2icellcelly.DGW.Entities.SubscriberMessage;
import com.i2icellcelly.DGW.Entities.SubscriberMessageFactory;

import java.util.Date;

public class SubscriberService implements ISubscriberService{

    ISubscriberDal subscriberDal = new RestSubscriberDal();
    String senderMSISDN;
    String receiverMSISDN;

    @Override
    public void generateTraffic(int messageType) {
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
    }
}

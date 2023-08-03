package com.i2icellcelly.DGW.RestApi;

import com.google.gson.*;
import com.i2icellcelly.DGW.Business.ISubscriberService;
import com.i2icellcelly.DGW.Business.SubscriberService;
import com.i2icellcelly.DGW.DataAccess.ISubscriberDal;
import com.i2icellcelly.DGW.DataAccess.RestSubscriberDal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubscribersController {

    ISubscriberDal subscriberDal = new RestSubscriberDal();
    ISubscriberService subscriberService = new SubscriberService();

    @GetMapping("/")
    public String get() {
        return "Hello World!";
    }

    @GetMapping("/call")
    public String getCall() {
        subscriberService.generateVoiceTraffic();
        return "A call has been requested.";
    }

    @GetMapping("/data")
    public String getData() {
        subscriberService.generateDataTraffic();
        return "Data usage has been requested.";
    }

    @GetMapping("/sms")
    public String getSms() {
        subscriberService.generateSmsTraffic();
        return "An SMS has been sent.";
    }

    @GetMapping("/getAllMSISDN")
    public String getAllMSISDN() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonArray allMsisdnJsonArray = subscriberDal.getAllSubscribers();

        return gson.toJson(allMsisdnJsonArray);
    }

    @GetMapping("/getRandomMSISDN")
    public String getRandomMSISDN() {
        return subscriberDal.getRandomSubscriber();
    }

    @GetMapping("/addSubscriber")
    public int addSubscriber() {
        return subscriberDal.addSubscriber();
    }

}

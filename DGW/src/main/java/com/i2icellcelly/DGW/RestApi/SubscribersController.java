package com.i2icellcelly.DGW.RestApi;

import com.google.gson.*;

import com.i2icellcelly.DGW.Business.ISubscriberService;
import com.i2icellcelly.DGW.DataAccess.ISubscriberDal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class SubscribersController {

    ISubscriberDal subscriberDal;
    ISubscriberService subscriberService;

    @Autowired
    public SubscribersController(ISubscriberDal sDal, ISubscriberService sSer){
        subscriberDal = sDal;
        subscriberService = sSer;
    }

    @GetMapping("/")
    public String get() {
        return "Hello World!";
    }

    @GetMapping("/generateTraffic")
    public String generateTraffic(@RequestParam int mType) {
        subscriberService.generateTraffic(mType);
        return "Traffic generated";
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

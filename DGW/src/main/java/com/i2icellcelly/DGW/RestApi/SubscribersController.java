package com.i2icellcelly.DGW.RestApi;

import com.google.gson.*;
import com.i2icellcelly.DGW.DataAccess.ISubscriberDal;
import com.i2icellcelly.DGW.DataAccess.RestSubscriberDal;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubscribersController {

    ISubscriberDal subscriberDal = new RestSubscriberDal();

    @GetMapping("/")
    public String get() {
        return "Hello World!";
    }

    @GetMapping("/call")
    public String getCall() {
        return "A call has been requested.";
    }

    @GetMapping("/data")
    public String getData() {
        return "Data usage has been requested.";
    }

    @GetMapping("/sms")
    public String getSms() {
        return "An SMS has been sent.";
    }

    @GetMapping("/catfact")
    public String getCatFact() throws UnirestException {
        HttpResponse<JsonNode> catFact = Unirest.get("https://catfact.ninja/fact").asJson();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        JsonObject jo = (JsonObject) jp.parse(catFact.getBody().toString());

        return gson.toJson(jo.get("fact"));
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

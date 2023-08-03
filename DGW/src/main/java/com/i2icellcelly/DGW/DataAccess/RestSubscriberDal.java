package com.i2icellcelly.DGW.DataAccess;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.i2icellcelly.DGW.Common.DGWLogger;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

import com.i2icellcelly.DGW.Common.GlobalData;
import org.springframework.stereotype.Repository;

@Repository
public class RestSubscriberDal implements ISubscriberDal{
    @Override
    public String getRandomSubscriber() {
        try {
            DGWLogger.printInfoLogs("Getting a random subscriber from Hazelcast");
            HttpResponse<String> randomMSISND = Unirest.get(GlobalData.HAZEL_ADDRESS + "getRandomMsisdn")
                    .asString();

            JsonParser jsonParser = new JsonParser();
            return jsonParser.parse(randomMSISND.getBody()).toString();
        } catch (Exception e){
            DGWLogger.printWarningLogs("Exception getting a random subscriber from Hazelcast: " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public JsonArray getAllSubscribers() {
        try {
            DGWLogger.printInfoLogs("Getting all subscriber from Hazelcast.");
            HttpResponse<String> allMSISND = Unirest.get(GlobalData.HAZEL_ADDRESS + "getAllMsisdn")
                    .asString();

            JsonParser jsonParser = new JsonParser();
            return  (JsonArray) jsonParser.parse(allMSISND.getBody());
        } catch (Exception e){
            DGWLogger.printWarningLogs("Exception getting all subscribers from Hazelcast: " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    // Used for testing purposes
//    @Override
//    public int addSubscriber() {
//        try {
//            HttpResponse<JsonNode> addSubscriberResponse = Unirest.post(GlobalData.HAZEL_ADDRESS)
//                    .header("Content-Type", "application/json")
//                    .body("{\"msisdn\" : \"" +
//                            GlobalData.randomMSISDN() +
//                            "\", \"subscId\" : \"" +
//                            GlobalData.randomID() +
//                            "\"}")
//                    .asJson();
//            if (addSubscriberResponse.getStatus() != 201){
//                System.out.println("Something went wrong.");
//                return -1;
//            }
//            return 1;
//        } catch (Exception e){
//            e.printStackTrace();
//            return -1;
//        }
//    }
}

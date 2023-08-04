package com.i2icellcelly.DGW.Entities;

import com.i2icellcelly.DGW.Common.DGWLogger;
import com.i2icellcelly.DGW.Common.GlobalData;

public class SubscriberMessageFactory {

    public static SubscriberMessage create(int messageType){

        DGWLogger.printInfoLogs("In the message factory.");
        SubscriberMessage subsMessage = new SubscriberMessage();

        //Data, SMS, Voice --> 000
        switch (messageType) {
            ///001 --> Voice
            case 1 -> {
                DGWLogger.printInfoLogs("In case 1; Voice");
                subsMessage.setVoiceService(1);
                subsMessage.setVoiceUsageAmount(GlobalData.randomUsage());
            }
            //010 --> SMS
            case 2 -> {
                DGWLogger.printInfoLogs("In case 2; SMS");
                subsMessage.setSmsService(1);
                subsMessage.setSmsUsageAmount(GlobalData.randomUsage());
            }
            //011 --> SMS, Voice
            case 3 -> {
                DGWLogger.printInfoLogs("In case 3; SMS and Voice");
                subsMessage.setSmsService(1);
                subsMessage.setSmsUsageAmount(GlobalData.randomUsage());
                subsMessage.setVoiceService(1);
                subsMessage.setVoiceUsageAmount(GlobalData.randomUsage());
            }
            //100 --> Data
            case 4 -> {
                DGWLogger.printInfoLogs("In case 4; Data");
                subsMessage.setDataService(1);
                subsMessage.setDataUsageAmount(GlobalData.randomUsage());
            }
            //101 --> Data, Voice
            case 5 -> {
                DGWLogger.printInfoLogs("In case 5; Data and Voice");
                subsMessage.setDataService(1);
                subsMessage.setDataUsageAmount(GlobalData.randomUsage());
                subsMessage.setVoiceService(1);
                subsMessage.setVoiceUsageAmount(GlobalData.randomUsage());
            }
            //110 --> Data, SMS
            case 6 -> {
                DGWLogger.printInfoLogs("In case 6; Data and SMS");
                subsMessage.setDataService(1);
                subsMessage.setDataUsageAmount(GlobalData.randomUsage());
                subsMessage.setSmsService(1);
                subsMessage.setSmsUsageAmount(GlobalData.randomUsage());
            }
            //111 --> Data, SMS and Voice
            case 7 -> {
                DGWLogger.printInfoLogs("In case 7; Data, SMS and Voice");
                subsMessage.setDataService(1);
                subsMessage.setDataUsageAmount(GlobalData.randomUsage());
                subsMessage.setSmsService(1);
                subsMessage.setSmsUsageAmount(GlobalData.randomUsage());
                subsMessage.setVoiceService(1);
                subsMessage.setVoiceUsageAmount(GlobalData.randomUsage());
            }
        }

        return subsMessage;
    }
}

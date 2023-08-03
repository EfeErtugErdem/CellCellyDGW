package com.i2icellcelly.DGW.Entities;

import com.i2icellcelly.DGW.Common.GlobalData;

public class SubscriberMessageFactory {

    public static SubscriberMessage create(int messageType){

        SubscriberMessage subsMessage = new SubscriberMessage();

        switch (messageType){
            case 1:
                subsMessage.setDataService(1);
                subsMessage.setDataUsageAmount(GlobalData.randomUsage());
            case 2:
                subsMessage.setSmsService(1);
                subsMessage.setSmsUsageAmount(GlobalData.randomUsage());
            case 3:
                subsMessage.setVoiceService(1);
                subsMessage.setVoiceUsageAmount(GlobalData.randomUsage());
            case 4:
                subsMessage.setDataService(1);
                subsMessage.setDataUsageAmount(GlobalData.randomUsage());
                subsMessage.setSmsService(1);
                subsMessage.setSmsUsageAmount(GlobalData.randomUsage());
            case 5:
                subsMessage.setDataService(1);
                subsMessage.setDataUsageAmount(GlobalData.randomUsage());
                subsMessage.setVoiceService(1);
                subsMessage.setVoiceUsageAmount(GlobalData.randomUsage());
            case 6:
                subsMessage.setSmsService(1);
                subsMessage.setSmsUsageAmount(GlobalData.randomUsage());
                subsMessage.setVoiceService(1);
                subsMessage.setVoiceUsageAmount(GlobalData.randomUsage());
            case 7:
                subsMessage.setDataService(1);
                subsMessage.setDataUsageAmount(GlobalData.randomUsage());
                subsMessage.setSmsService(1);
                subsMessage.setSmsUsageAmount(GlobalData.randomUsage());
                subsMessage.setVoiceService(1);
                subsMessage.setVoiceUsageAmount(GlobalData.randomUsage());
        }

        return subsMessage;
    }

}

package com.i2icellcelly.DGW.RestApi;

import com.i2icellcelly.DGW.Business.ISubscriberService;
import com.i2icellcelly.DGW.Common.DGWLogger;
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
        if (mType < 1 || mType > 7){
            DGWLogger.printWarningLogs("Invalid query parameter supplied to /generateTraffic: " + mType);
            return "Invalid query parameter. Please supply a value between 1 and 7, inclusive";
        }
        DGWLogger.printInfoLogs("Generating new traffic with message type: " + mType);
        subscriberService.generateTraffic(mType);
        return "Traffic generated with message type: " + mType;
    }
}

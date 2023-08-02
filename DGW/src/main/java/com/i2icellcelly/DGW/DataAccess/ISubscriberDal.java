package com.i2icellcelly.DGW.DataAccess;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.JsonArray;

public interface ISubscriberDal {

    public String getRandomSubscriber();
    public JsonArray getAllSubscribers();
    public int addSubscriber();

}

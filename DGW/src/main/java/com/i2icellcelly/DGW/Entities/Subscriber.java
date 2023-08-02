package com.i2icellcelly.DGW.Entities;

public class Subscriber {
    private String _MSISDN;
    private int _id;

    public Subscriber(String _MSISDN, int _id) {
        this._MSISDN = _MSISDN;
        this._id = _id;
    }

    public String getMSISDN() {
        return _MSISDN;
    }
    public void setMSISDN(String _MSISDN) {
        this._MSISDN = _MSISDN;
    }

    public int getId() {
        return _id;
    }
    public void setId(int _id) {
        this._id = _id;
    }
}

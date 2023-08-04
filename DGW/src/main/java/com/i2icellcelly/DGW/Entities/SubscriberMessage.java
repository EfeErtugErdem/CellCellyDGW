package com.i2icellcelly.DGW.Entities;

import java.util.Date;

public class SubscriberMessage {
    private String _senderMSISDN;
    private String _receiverMSISDN;
    private int _smsService;
    private int _smsUsageAmount;
    private int _voiceService;
    private int _voiceUsageAmount;
    private int _dataService;
    private int _dataUsageAmount;
    private Date _startDate;
    private Date _endDate;


    public SubscriberMessage(String _senderMSISDN, String _receiverMSISDN,
                             int _smsService, int _smsUsageAmount,
                             int _voiceService, int _voiceUsageAmount,
                             int _dataService, int _dataUsageAmount,
                             Date _startDate, Date _endDate) {
        this._senderMSISDN = _senderMSISDN;
        this._receiverMSISDN = _receiverMSISDN;
        this._smsService = _smsService;
        this._smsUsageAmount = _smsUsageAmount;
        this._voiceService = _voiceService;
        this._voiceUsageAmount = _voiceUsageAmount;
        this._dataService = _dataService;
        this._dataUsageAmount = _dataUsageAmount;
        this._startDate = _startDate;
        this._endDate = _endDate;
    }

    public SubscriberMessage(){
        this._senderMSISDN = null;
        this._receiverMSISDN = null;
        this._smsService = 0;
        this._smsUsageAmount = 0;
        this._voiceService = 0;
        this._voiceUsageAmount = 0;
        this._dataService = 0;
        this._dataUsageAmount = 0;
        this._startDate = null;
        this._endDate = null;
    }

    public String getSenderMSISDN() {
        return _senderMSISDN;
    }

    public void setSenderMSISDN(String _senderMSISDN) {
        this._senderMSISDN = _senderMSISDN;
    }

    public String getReceiverMSISDN() {
        return _receiverMSISDN;
    }

    public void setReceiverMSISDN(String _receiverMSISDN) {
        this._receiverMSISDN = _receiverMSISDN;
    }

    public int getSmsService() {
        return _smsService;
    }

    public void setSmsService(int _smsService) {
        this._smsService = _smsService;
    }

    public int getSmsUsageAmount() {
        return _smsUsageAmount;
    }

    public void setSmsUsageAmount(int _smsUsageAmount) {
        this._smsUsageAmount = _smsUsageAmount;
    }

    public int getVoiceService() {
        return _voiceService;
    }

    public void setVoiceService(int _voiceService) {
        this._voiceService = _voiceService;
    }

    public int getVoiceUsageAmount() {
        return _voiceUsageAmount;
    }

    public void setVoiceUsageAmount(int _voiceUsageAmount) {
        this._voiceUsageAmount = _voiceUsageAmount;
    }

    public int getDataService() {
        return _dataService;
    }

    public void setDataService(int _dataService) {
        this._dataService = _dataService;
    }

    public int getDataUsageAmount() {
        return _dataUsageAmount;
    }

    public void setDataUsageAmount(int _dataUsageAmount) {
        this._dataUsageAmount = _dataUsageAmount;
    }

    public Date getStartDate() {
        return _startDate;
    }

    public void setStartDate(Date _startDate) {
        this._startDate = _startDate;
    }

    public Date getEndDate() {
        return _endDate;
    }

    public void setEndDate(Date _endDate) {
        this._endDate = _endDate;
    }

    @Override
    public String toString() {
        return "SubscriberMessage{\n" +
                "SenderMSISDN= '" + _senderMSISDN + '\'' + ",\n" +
                "ReceiverMSISDN= '" + _receiverMSISDN + '\'' + ",\n" +
                "SmsService= " + _smsService + ",\n" +
                "SmsUsageAmount= " + _smsUsageAmount + ",\n" +
                "VoiceService= " + _voiceService + ",\n" +
                "VoiceUsageAmount= " + _voiceUsageAmount + ",\n" +
                "DataService= " + _dataService + ",\n" +
                "DataUsageAmount= " + _dataUsageAmount + ",\n" +
                "StartDate= " + _startDate + ",\n" +
                "EndDate= " + _endDate +
                '}';
    }
}

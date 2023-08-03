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

    public String get_senderMSISDN() {
        return _senderMSISDN;
    }

    public void set_senderMSISDN(String _senderMSISDN) {
        this._senderMSISDN = _senderMSISDN;
    }

    public String get_receiverMSISDN() {
        return _receiverMSISDN;
    }

    public void set_receiverMSISDN(String _receiverMSISDN) {
        this._receiverMSISDN = _receiverMSISDN;
    }

    public int get_smsService() {
        return _smsService;
    }

    public void set_smsService(int _smsService) {
        this._smsService = _smsService;
    }

    public int get_smsUsageAmount() {
        return _smsUsageAmount;
    }

    public void set_smsUsageAmount(int _smsUsageAmount) {
        this._smsUsageAmount = _smsUsageAmount;
    }

    public int get_voiceService() {
        return _voiceService;
    }

    public void set_voiceService(int _voiceService) {
        this._voiceService = _voiceService;
    }

    public int get_voiceUsageAmount() {
        return _voiceUsageAmount;
    }

    public void set_voiceUsageAmount(int _voiceUsageAmount) {
        this._voiceUsageAmount = _voiceUsageAmount;
    }

    public int get_dataService() {
        return _dataService;
    }

    public void set_dataService(int _dataService) {
        this._dataService = _dataService;
    }

    public int get_dataUsageAmount() {
        return _dataUsageAmount;
    }

    public void set_dataUsageAmount(int _dataUsageAmount) {
        this._dataUsageAmount = _dataUsageAmount;
    }

    public Date get_startDate() {
        return _startDate;
    }

    public void set_startDate(Date _startDate) {
        this._startDate = _startDate;
    }

    public Date get_endDate() {
        return _endDate;
    }

    public void set_endDate(Date _endDate) {
        this._endDate = _endDate;
    }
}

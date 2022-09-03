package com.example.cashingsystem.service;

public interface SetConsumptionService {
    public int getConsumption (String phone_id);
    public boolean setConsumption (String phone_id,int newConsumption);
}

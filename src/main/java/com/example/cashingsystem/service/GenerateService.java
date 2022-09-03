package com.example.cashingsystem.service;

public interface GenerateService {
    public boolean registerMember(String name, String phone_id);

    public boolean generateOrder (String phone_id,int amount,String pay_method);
}

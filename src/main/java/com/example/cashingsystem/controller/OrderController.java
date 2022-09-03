package com.example.cashingsystem.controller;


import com.example.cashingsystem.pojo.t_order;
import com.example.cashingsystem.service.GetInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private GetInfoService getInfoService;

    @RequestMapping("/list")
    public List<t_order> listAll(){
        return getInfoService.GetOrders();
    }
}

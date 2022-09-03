package com.example.cashingsystem.controller;

import com.example.cashingsystem.pojo.t_goods;
import com.example.cashingsystem.pojo.t_member;
import com.example.cashingsystem.service.GetInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GetInfoService getInfoService;

    @RequestMapping("/list")
    public List<t_goods> listAll(){
        return getInfoService.GetGoods();
    }
}

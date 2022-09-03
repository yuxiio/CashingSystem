package com.example.cashingsystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.cashingsystem.dao.t_memberDao;
import com.example.cashingsystem.dao.t_orderDao;
import com.example.cashingsystem.pojo.t_member;
import com.example.cashingsystem.pojo.t_order;
import com.example.cashingsystem.service.GenerateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class GenerateServiceImpl implements GenerateService {

    @Autowired
    t_memberDao t_memberdao;
    @Autowired
    t_orderDao t_orderdao;


    @Override
    public boolean registerMember(String name, String phone_id) {
        QueryWrapper<t_member> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("phone_id",phone_id);
        t_member user = t_memberdao.selectOne(queryWrapper);
        if(user == null) return false;
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sdf.format(date);
        t_member member = new t_member(name, phone_id, time, 0);
        t_memberdao.insert(member);
        return true;
    }

    @Override
    public boolean generateOrder(String phone_id, int amount, String pay_method) {
        QueryWrapper<t_member> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("phone_id",phone_id);
        t_member user = t_memberdao.selectOne(queryWrapper);
        if(user == null) return false;
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sdf.format(date);
        t_order order = new t_order(time,amount,phone_id,pay_method);
        t_orderdao.insert(order);
        return true;
    }
}

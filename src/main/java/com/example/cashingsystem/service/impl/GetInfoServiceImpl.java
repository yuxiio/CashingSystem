package com.example.cashingsystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.cashingsystem.dao.t_goodsDao;
import com.example.cashingsystem.dao.t_memberDao;
import com.example.cashingsystem.dao.t_orderDao;
import com.example.cashingsystem.pojo.t_goods;
import com.example.cashingsystem.pojo.t_member;
import com.example.cashingsystem.pojo.t_order;
import com.example.cashingsystem.service.GetInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetInfoServiceImpl implements GetInfoService {

    @Autowired
    t_memberDao t_memberdao;

    @Autowired
    t_orderDao t_orderdao;

    @Autowired
    t_goodsDao t_goodsdao;

    @Override
    public List<t_member> GetMembers() {
        return (List<t_member>) t_memberdao.selectList(null);
    }

    @Override
    public List<t_order> GetOrders() {
        return (List<t_order>) t_orderdao.selectList(null);
    }

    @Override
    public List<t_goods> GetGoods() {
        return (List<t_goods>) t_goodsdao.selectList(null);
    }

    @Override
    public List<t_order> GetOrdersByMember(String phone_id) {
        QueryWrapper<t_order> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("phone_id",phone_id);
        return (List<t_order>) t_orderdao.selectList(queryWrapper);
    }
}

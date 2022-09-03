package com.example.cashingsystem.service;

import com.example.cashingsystem.pojo.t_goods;
import com.example.cashingsystem.pojo.t_member;
import com.example.cashingsystem.pojo.t_order;

import java.util.List;

public interface GetInfoService {



    /**
     * 获取当前系统的所有注册会员
     */
    public List<t_member> GetMembers ();

    /**
     * 获取当前系统的所有订单
     */
    public List<t_order> GetOrders();

    /**
     * 获取当前系统的所有物品
     */
    public List<t_goods> GetGoods();

    /**
     * 获取某个用户的所有订单
     */
    public List<t_order> GetOrdersByMember(String phone_id);
}

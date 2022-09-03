package com.example.cashingsystem.dao;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.cashingsystem.pojo.t_order;
import org.apache.ibatis.annotations.Mapper;



@Mapper
@TableName("t_order")
public interface t_orderDao extends BaseMapper<t_order> {
}

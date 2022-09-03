package com.example.cashingsystem.dao;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.cashingsystem.pojo.t_goods;
import org.apache.ibatis.annotations.Mapper;


@Mapper
@TableName("t_goods")
public interface t_goodsDao extends BaseMapper<t_goods> {
}

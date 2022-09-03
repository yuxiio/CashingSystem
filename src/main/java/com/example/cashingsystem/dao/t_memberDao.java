package com.example.cashingsystem.dao;


import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.cashingsystem.pojo.t_member;
import org.apache.ibatis.annotations.Mapper;



@Mapper
@TableName("t_member")
public interface t_memberDao extends BaseMapper<t_member> {
}

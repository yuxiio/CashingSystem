package com.example.cashingsystem;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.cashingsystem.dao.t_memberDao;
import com.example.cashingsystem.dao.t_orderDao;
import com.example.cashingsystem.pojo.t_member;
import com.example.cashingsystem.pojo.t_order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
//@MapperScan("com.example.cashingsystem.dao")
public class Test01 {

    @Autowired
    private t_memberDao t_memberDao;

    @Autowired
    private com.example.cashingsystem.dao.t_orderDao t_orderDao;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
//        if(t_memberDao == null) System.out.println("1");
        List<t_order> userList = t_orderDao.selectList(null);
        userList.forEach(System.out::println);
    }
    @Test
    public void selectOne() {
        QueryWrapper<t_member> queryWrapper = new QueryWrapper<>();
        //查询名字为 Tom 的一条记录
        queryWrapper.eq("phone_id","123213124");
//        List<> user = t_memberDao.selectList(queryWrapper);

    }

}

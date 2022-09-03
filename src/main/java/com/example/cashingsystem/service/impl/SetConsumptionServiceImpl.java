package com.example.cashingsystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.cashingsystem.dao.t_memberDao;
import com.example.cashingsystem.pojo.t_member;
import com.example.cashingsystem.service.SetConsumptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SetConsumptionServiceImpl implements SetConsumptionService {
    @Autowired
    t_memberDao t_memberdao;

    @Override
    public int getConsumption(String phone_id) {
        QueryWrapper<t_member> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("phone_id",phone_id);
        t_member member = t_memberdao.selectOne(queryWrapper);
        return member.getTotal_consumption();
    }

    @Override
    public boolean setConsumption(String phone_id, int newConsumption) {
        UpdateWrapper<t_member> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("name","rhb");
        t_member member = new t_member();
        member.setTotal_consumption(newConsumption);
        try {
            t_memberdao.update(member, updateWrapper);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}

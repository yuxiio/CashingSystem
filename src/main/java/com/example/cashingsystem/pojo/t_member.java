package com.example.cashingsystem.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class t_member {
    @TableId(type = IdType.AUTO)
    Integer id;
    String name;
    String phone_id;
    String time;

    int total_consumption;


    public t_member() {
    }


    public t_member(String name, String phone_id, String time, int total_consumption) {
        this.name = name;
        this.phone_id = phone_id;
        this.time = time;
        this.total_consumption = total_consumption;
    }
}

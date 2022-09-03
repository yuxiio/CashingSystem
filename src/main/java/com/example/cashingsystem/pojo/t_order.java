package com.example.cashingsystem.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class t_order {
    @TableId(type = IdType.AUTO)
    Integer id;
    String time;
    int amount;
    String phone_id;
    String pay_method;

    public t_order() {
    }

    public t_order(Integer id, String time, int amount, String phone_id, String pay_method) {
        this.id = id;
        this.time = time;
        this.amount = amount;
        this.phone_id = phone_id;
        this.pay_method = pay_method;
    }

    public t_order(String time, int amount, String phone_id, String pay_method) {
        this.time = time;
        this.amount = amount;
        this.phone_id = phone_id;
        this.pay_method = pay_method;
    }
}

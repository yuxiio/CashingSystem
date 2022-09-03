package com.example.cashingsystem.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class t_goods {
    @TableId(type = IdType.AUTO)
    Integer id;
    String name;
    Double price;

    public t_goods() {
    }

    public t_goods(String name, Double price) {
        this.name = name;
        this.price = price;
    }
}

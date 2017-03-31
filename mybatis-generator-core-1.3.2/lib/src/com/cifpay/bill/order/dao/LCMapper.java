package com.cifpay.bill.order.dao;

import com.cifpay.bill.common.entity.LC;

public interface LCMapper {
    int deleteByPrimaryKey(Long lcId);

    int insert(LC record);

    int insertSelective(LC record);

    LC selectByPrimaryKey(Long lcId);

    int updateByPrimaryKeySelective(LC record);

    int updateByPrimaryKey(LC record);
}
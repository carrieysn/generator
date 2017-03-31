package com.cifpay.bill.order.dao;

import com.cifpay.bill.common.entity.BillTemplate;

public interface BillTemplateMapper {
    int deleteByPrimaryKey(Integer btId);

    int insert(BillTemplate record);

    int insertSelective(BillTemplate record);

    BillTemplate selectByPrimaryKey(Integer btId);

    int updateByPrimaryKeySelective(BillTemplate record);

    int updateByPrimaryKey(BillTemplate record);
}
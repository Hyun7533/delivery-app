package com.delivery.deliveryback.join;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JoinMapper {

    void addCustomer(JoinEntity joinEntity);
}

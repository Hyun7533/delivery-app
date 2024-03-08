package com.delivery.delivery.join;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JoinMapper {

    void saveMember(JoinEntity joinEntity);

}

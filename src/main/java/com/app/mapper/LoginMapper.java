package com.app.mapper;

import com.app.entity.Login;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LoginMapper {

    @Select("SELECT * FROM login WHERE id = #{id}")
    Login findById(Long id);

    @Select("SELECT * FROM login")
    List<Login> findAll();
}
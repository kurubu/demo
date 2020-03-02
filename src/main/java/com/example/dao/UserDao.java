package com.example.dao;

import com.example.entity.User;
import org.beetl.sql.core.annotatoin.Param;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.mapper.BaseMapper;

import javax.annotation.Resource;
import java.util.List;

@SqlResource("dome")
@Resource
public interface UserDao extends BaseMapper<User> {

    List<User> find(@Param("page") int page, @Param("size") int size);
}
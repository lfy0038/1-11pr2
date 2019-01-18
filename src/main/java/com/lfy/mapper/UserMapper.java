package com.lfy.mapper;

import com.lfy.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from xt_user")
    public List<User> selAllUser() ;
}

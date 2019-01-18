package com.lfy.serviceimpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lfy.mapper.UserMapper;
import com.lfy.pojo.User;
import com.lfy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceinpl implements UserService {
    int a;
    @Autowired
    private UserMapper userMapper;
    @Override
    public PageInfo selAllUser(int page, int num) {
        PageHelper.startPage(page,num);
        List<User> list=userMapper.selAllUser();
        PageInfo pageInfo=new PageInfo<>(list);
        a=pageInfo.getPages();
        System.out.println(a);
        return pageInfo;
    }
}

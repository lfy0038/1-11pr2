package com.lfy.service;

import com.github.pagehelper.PageInfo;
import com.lfy.pojo.User;

import java.util.List;

public interface UserService {
    public PageInfo selAllUser(int page, int num);
}

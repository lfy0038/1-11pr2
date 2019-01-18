package com.lfy.controller;

import com.github.pagehelper.PageInfo;
import com.lfy.pojo.User;
import com.lfy.service.UserService;
import com.lfy.serviceimpl.UserServiceinpl;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/")
    public String sel(Model model){
        System.out.println("11");
        PageInfo pageInfo =userService.selAllUser(1,2);
        List<User> list=pageInfo.getList();
        int a=pageInfo.getPages();
        List<Integer> list1=new ArrayList<Integer>();
        for (int b=1;b<=a;b++){
            list1.add(b);
        }
        model.addAttribute("list",list);
        model.addAttribute("list1",list1);
        return "show";
    }
    @RequestMapping("/sel2")
    @ResponseBody
    public List<User> sel2(Model model,String num){
        System.out.println("22");
        System.out.println(num);
        Integer num2 = Integer.valueOf(num).intValue();
        System.out.println("i++"+num2);
        PageInfo pageInfo =userService.selAllUser(num2,2);
        List<User> list=pageInfo.getList();
        int a=pageInfo.getPages();
        List<Integer> list1=new ArrayList<Integer>();
        for (int b=1;b<=a;b++){
            list1.add(b);
        }
        model.addAttribute("list",list);
        model.addAttribute("list1",list1);
        return list;
    }
}

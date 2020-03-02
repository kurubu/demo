package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Api(value = "测试")
@Controller
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    UserService userService;

    @ApiOperation(value = "分页查询")
    @ResponseBody
    @RequestMapping("/find")
    public List<User> find(int page, int size) {
        List<User> arr = userService.find(page, size);
        return arr;
    }

    @ApiOperation(value = "添加用户")
    @ResponseBody
    @RequestMapping("/add")
    public void add(User user) {
        userService.add(user);
    }

    @ApiOperation(value = "根据id删除")
    @ResponseBody
    @RequestMapping("/del")
    public void del(String id) {
        userService.del(id);
    }

    @ApiOperation(value = "根据id更新")
    @ResponseBody
    @RequestMapping("/updata")
    public void updata(User user) {
        userService.updata(user);
    }
}
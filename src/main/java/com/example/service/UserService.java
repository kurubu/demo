package com.example.service;

import com.example.dao.UserDao;
import com.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;


    public void add(User user) {
        userDao.insert(user);
    }

    public void del(String id) {
        userDao.deleteById(id);
    }

    public void updata(User user) {
        userDao.updateById(user);
    }

    public List<User> find(int page, int size) {

        List<User> template = userDao.find(page*size, size);
        return template;
    }
}

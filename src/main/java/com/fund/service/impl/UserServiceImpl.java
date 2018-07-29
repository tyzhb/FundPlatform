package com.fund.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.fund.dao.UserDao;
import com.fund.entity.User;
import com.fund.service.UserService;


@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Resource
    private UserDao userDao;

    public List<User> getuserlist(int id) {
        // TODO Auto-generated method stub
        return userDao.getuserlist(id);
    }

}

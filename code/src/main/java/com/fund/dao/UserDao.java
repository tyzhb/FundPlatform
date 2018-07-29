package com.fund.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fund.entity.User;

public interface UserDao {

	List<User> getuserlist(@Param("id") int id);

}

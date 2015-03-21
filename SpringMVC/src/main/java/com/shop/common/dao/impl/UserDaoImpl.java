package com.shop.common.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.shop.common.dao.UserDao;
import com.shop.common.model.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Autowired
	DataSource dataSource;

	public void insertData(User user) {
		super.getSqlSession().insert("User.insertUser", user);
	}

	public List<User> getUserList() {
		return super.getSqlSession().selectList("User.getUserList");
	}

	@Override
	public void deleteData(String id) {
		super.getSqlSession().delete("User.deleteUser", id);
	}

	@Override
	public void updateData(User user) {

	}

	@Override
	public User getUser(String id) {
		List<User> userList = new ArrayList<User>();
		String sql = "select * from users where user_id= " + id;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		userList = jdbcTemplate.query(sql, new UserRowMapper());
		return userList.get(0);
	}

}
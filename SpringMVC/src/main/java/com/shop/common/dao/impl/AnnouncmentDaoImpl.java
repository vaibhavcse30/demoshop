package com.shop.common.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import com.shop.common.dao.AnnouncmentDao;
import com.shop.common.model.Announcment;

public class AnnouncmentDaoImpl extends SqlSessionDaoSupport implements
		AnnouncmentDao {
	@Autowired
	DataSource dataSource;

	@Override
	public void insertData(Announcment announcment) {
		super.getSqlSession().insert("Announcment.insertData", announcment);
	}

	@Override
	public List<Announcment> getAnnouncmentList() {
		return super.getSqlSession().selectList(
				"Announcment.getAnnouncmentList");
	}

	@Override
	public List<Announcment> getAnnouncmentList(String id) {
		return super.getSqlSession().selectList(
				"Announcment.getAnnouncmentListid", id);
	}

}

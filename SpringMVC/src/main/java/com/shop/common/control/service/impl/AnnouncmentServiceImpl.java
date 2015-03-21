package com.shop.common.control.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.shop.common.control.service.AnnouncmentService;
import com.shop.common.dao.AnnouncmentDao;
import com.shop.common.model.Announcment;

public class AnnouncmentServiceImpl implements AnnouncmentService{

	@Autowired
	AnnouncmentDao announcmentDao;
	@Override
	public void insertData(Announcment announcment) {
		announcmentDao.insertData(announcment);		
	}

	@Override
	public List<Announcment> getAnnouncmentList() {
		return announcmentDao.getAnnouncmentList();
	}

	@Override
	public List<Announcment> getAnnouncmentList(String userID) {
		return announcmentDao.getAnnouncmentList(userID);
	}

}

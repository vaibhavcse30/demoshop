package com.shop.common.control.service;

import java.util.List;

import com.shop.common.model.Announcment;

public interface AnnouncmentService {
	public void insertData(Announcment announcment);

	public List<Announcment> getAnnouncmentList();

	public List<Announcment> getAnnouncmentList(String userID);
}

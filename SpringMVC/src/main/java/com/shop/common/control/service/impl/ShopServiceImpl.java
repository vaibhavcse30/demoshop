package com.shop.common.control.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.shop.common.control.service.ShopService;
import com.shop.common.dao.ShopDao;
import com.shop.common.model.Shop;

public class ShopServiceImpl implements ShopService {

	@Autowired
	ShopDao shopDao;

	@Override
	public void insertData(Shop shop) {
		shopDao.insertData(shop);
	}
}
package com.shop.common.control.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.shop.common.control.service.OrdersService;
import com.shop.common.dao.AddressDao;
import com.shop.common.dao.OrdersDao;
import com.shop.common.model.Address;
import com.shop.common.model.Items;
import com.shop.common.model.Orders;

public class OrdersServiceImpl implements OrdersService {

	@Autowired
	OrdersDao ordersDao;
	@Autowired
	AddressDao addressDao;

	@Override
	public void insertData(Items item, Address address) {
		addressDao.insertData(address);
		Orders order = new Orders();
		item.setItemId(2);
		ordersDao.insertData(order);
		ordersDao.insertData(item.getItemId(), order.getOrderId());
		ordersDao.insertDataAdd(address.getAddressId(), order.getOrderId());

	}
}
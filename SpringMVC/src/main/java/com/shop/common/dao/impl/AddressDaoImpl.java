package com.shop.common.dao.impl;
import javax.sql.DataSource;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import com.shop.common.dao.AddressDao;
import com.shop.common.model.Address;

public class AddressDaoImpl extends SqlSessionDaoSupport implements AddressDao {  

	@Autowired  
	DataSource dataSource;  

	public void insertData(Address address) {  
		super.getSqlSession().insert("Orders.addAddress", address);
	}  


}  
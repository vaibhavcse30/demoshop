package com.shop.common.dao.impl;
import javax.sql.DataSource;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import com.shop.common.dao.ShopDao;
import com.shop.common.model.Shop;

public class ShopDaoImpl extends SqlSessionDaoSupport implements ShopDao {  

	@Autowired  
	DataSource dataSource;  

	public void insertData(Shop shop) {  
		super.getSqlSession().insert("Shop.insertData", shop);
	}  


}  
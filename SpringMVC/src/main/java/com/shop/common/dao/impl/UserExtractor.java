package com.shop.common.dao.impl;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.shop.common.model.User;
  
public class UserExtractor implements ResultSetExtractor<User> {  
  
 public User extractData(ResultSet resultSet) throws SQLException,  
   DataAccessException {  
    
  User user = new User();  
    
  user.setUserId(resultSet.getInt(1));  
  user.setFirstName(resultSet.getString(2));  
  user.setLastName(resultSet.getString(3));  
  user.setGender(resultSet.getString(4));  
  user.setCity(resultSet.getString(5));  
    
  return user;  
 }  
  
} 
package com.shop.common.control.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.shop.common.control.service.UserService;
import com.shop.common.dao.UserDao;
import com.shop.common.model.User;
  
public class UserServiceImpl implements UserService {  
  
 @Autowired  
 UserDao userdao;  
  
 @Override  
 public void insertData(User user) {  
  userdao.insertData(user);  
 }  
  
 @Override  
 public List<User> getUserList() {  
  return userdao.getUserList();  
 }  
  
 @Override  
 public void deleteData(String id) {  
  userdao.deleteData(id);  
    
 }  
  
 @Override  
 public User getUser(String id) {  
  return userdao.getUser(id);  
 }  
  
 @Override  
 public void updateData(User user) {  
  userdao.updateData(user);  
    
 }  
  
  
   
}  
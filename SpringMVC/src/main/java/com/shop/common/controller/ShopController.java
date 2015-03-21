package com.shop.common.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.shop.common.control.service.AnnouncmentService;
import com.shop.common.control.service.ShopService;
import com.shop.common.control.service.UserService;
import com.shop.common.model.Announcment;
import com.shop.common.model.Shop;
import com.shop.common.model.User;

@Controller
@RequestMapping("/data")
public class ShopController {

	@Autowired
	private ShopService shopService;
	@Autowired
	private UserService userService;
	@Autowired
	private AnnouncmentService announcmentService;

	@RequestMapping(value = "/test/{name}", method = RequestMethod.GET)
	public @ResponseBody Shop getShopInJSON(@PathVariable String name) {
		Shop shop = new Shop();
		shop.setName(name);
		shop.setStaffName("vaibhav");
		shopService.insertData(shop);
		return shop;
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public @ResponseBody String insertUserData(@RequestBody String strBody) {
		System.out.println(strBody);
		JsonElement jsonElement = null;
		Gson gson = new Gson();

		jsonElement = new JsonParser().parse(strBody);
		User user = gson.fromJson(jsonElement, User.class);

		if (user != null)
			userService.insertData(user);
		return "success";
	}

	@RequestMapping(value = "/getUser", method = RequestMethod.GET)
	public @ResponseBody List<User> getUserList(@RequestBody String strBody) {
		List<User> userList = userService.getUserList();
		return userList;
	}

	@RequestMapping(value = "/addAnnouncment", method = RequestMethod.POST)
	public @ResponseBody String addAnnouncment(@RequestBody String strBody) {
		JsonElement jsonElement = null;
		Gson gson = new Gson();

		jsonElement = new JsonParser().parse(strBody);
		Announcment announcment = gson.fromJson(jsonElement, Announcment.class);

		if (announcment != null)
			announcmentService.insertData(announcment);
		return "success";
	}

	@RequestMapping(value = "/getAnnouncmentById", method = RequestMethod.GET)
	public @ResponseBody List<Announcment> getAnnouncmentById(
			@RequestBody String strBody,
			@RequestParam(value = "uid", required = false) String uid) {
		return announcmentService.getAnnouncmentList(uid);
	}

	@RequestMapping(value = "/getAnnouncment", method = RequestMethod.GET)
	public @ResponseBody List<Announcment> getAnnouncment(
			@RequestBody String strBody) {
		return announcmentService.getAnnouncmentList();
	}
}
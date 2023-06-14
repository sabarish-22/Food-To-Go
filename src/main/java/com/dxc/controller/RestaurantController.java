package com.dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.entity.Restaurant;
import com.dxc.service.RestaurantService;

@RestController
@RequestMapping("/api/Restaurant")
public class RestaurantController {

	@Autowired
	RestaurantService restaurantService;
	
	@GetMapping("/getAll")
	public List<Restaurant> getAllRestaurant() {
		return restaurantService.getAllRestaurants();
	}
}

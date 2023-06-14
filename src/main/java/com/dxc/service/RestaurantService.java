package com.dxc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.repository.RestaurantRepository;
import com.dxc.entity.Restaurant;

@Service
public class RestaurantService {
	
	@Autowired
	RestaurantRepository restaurantRepository;

	public List<Restaurant> getAllRestaurants() {
	
		return restaurantRepository.findAll();
	}
}

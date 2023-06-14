package com.dxc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.entity.Restaurant;


public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}

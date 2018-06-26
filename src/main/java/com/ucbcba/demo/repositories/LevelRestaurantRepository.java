package com.ucbcba.demo.repositories;

import com.ucbcba.demo.entities.LevelRestaurant;
import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;

@Transactional
public interface LevelRestaurantRepository extends CrudRepository<LevelRestaurant, Integer> {
}

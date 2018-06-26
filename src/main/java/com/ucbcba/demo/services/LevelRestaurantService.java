package com.ucbcba.demo.services;

import com.ucbcba.demo.entities.LevelRestaurant;

public interface LevelRestaurantService {

    Iterable<LevelRestaurant> listAllLevelRestaurants();

    void saveLevelRestaurant(LevelRestaurant levelRestaurant);

    LevelRestaurant getLevelRestaurant(Integer id);

    void deleteLevelRestaurant(Integer id);
}

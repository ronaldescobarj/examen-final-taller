package com.ucbcba.demo.services;

import com.ucbcba.demo.entities.LevelRestaurant;
import com.ucbcba.demo.repositories.LevelRestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class LevelRestaurantServiceImpl implements LevelRestaurantService {

    private LevelRestaurantRepository levelRestaurantRepository;

    @Autowired
    @Qualifier(value = "levelRestaurantRepository")
    public void setLevelRestaurantRepository(LevelRestaurantRepository levelRestaurantRepository) {
        this.levelRestaurantRepository = levelRestaurantRepository;
    }

    @Override
    public Iterable<LevelRestaurant> listAllLevelRestaurants() {
        return this.levelRestaurantRepository.findAll();
    }

    public void saveLevelRestaurant(LevelRestaurant levelRestaurant) {
        this.levelRestaurantRepository.save(levelRestaurant);
    }

    public LevelRestaurant getLevelRestaurant(Integer id) {
        return this.levelRestaurantRepository.findOne(id);
    }

    public void deleteLevelRestaurant(Integer id) {
        this.levelRestaurantRepository.delete(id);
    }
}

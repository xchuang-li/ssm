package com.cay.ssm.service;

import com.cay.ssm.entity.Food;

import java.util.List;

public interface FoodService {
    Food queryFoodById(Integer id);
    int addFood(Food food);
    List<Food> queryAllFood();
}

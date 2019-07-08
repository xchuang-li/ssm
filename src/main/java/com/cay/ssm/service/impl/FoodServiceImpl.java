package com.cay.ssm.service.impl;

import com.cay.ssm.mapper.FoodMapper;
import com.cay.ssm.entity.Food;
import com.cay.ssm.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    FoodMapper foodMapper;

    @Override
    public Food queryFoodById(Integer id) {
        return foodMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addFood(Food food) {
        return foodMapper.insert(food);
    }

    @Override
    public List<Food> queryAllFood() {
        return foodMapper.selectAllFood();
    }
}

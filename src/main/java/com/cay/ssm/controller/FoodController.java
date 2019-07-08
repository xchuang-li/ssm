
package com.cay.ssm.controller;

import com.cay.ssm.entity.Food;
import com.cay.ssm.service.impl.FoodServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class FoodController {
    Logger logger= LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    @Autowired
    FoodServiceImpl foodService;

    @RequestMapping("/queryfoodbyid")
    public String queryFoodbyId(Map map){
        Food food = foodService.queryFoodById(1);
        logger.info("Food:"+food);
        map.put("food",food);
        logger.info("map"+map);
        return "food";
    }
    @RequestMapping("/addFood")
    public String addFood(Food food){
        logger.info("Food:"+food);
        int i = foodService.addFood(food);
        logger.info(i==1 ? "新增成功":"新增失败");
        return "success";
    }

    @RequestMapping("/queryAllFood")
    public String queryAllFood(Map map){
        List<Food> list = foodService.queryAllFood();
        logger.info("查询成功！");
        logger.info("List<Food>:"+list);
        map.put("user",list);
        return "success";
    }
}

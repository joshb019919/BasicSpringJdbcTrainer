package edu.jborthick.service;

import edu.jborthick.dao.FoodDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
  @Autowired
  private FoodDao foodDao;

  public void printAllFoodNames() {
    System.out.println("Food Report Start!");
    foodDao.getAllFoods().forEach(System.out::println);
    System.out.println("Food Report Stop...");
  }
}

package edu.jborthick.service;

import edu.jborthick.dao.FoodDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodReportService {

  @Autowired
  private FoodDao foodDao;

  public void printReport() {
    System.out.println("Starting food report:");
    foodDao.findFoodNames().forEach(System.out::println);
    System.out.println("End of food report.");
  }
}

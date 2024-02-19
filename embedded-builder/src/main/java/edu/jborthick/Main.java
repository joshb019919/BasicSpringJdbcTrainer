package edu.jborthick;

import edu.jborthick.service.FoodService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Main {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
    context.registerShutdownHook();
    FoodService foodService = context.getBean(FoodService.class);
    foodService.printAllFoodNames();
  }
}
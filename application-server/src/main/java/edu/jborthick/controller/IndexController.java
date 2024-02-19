package edu.jborthick.controller;

import edu.jborthick.dao.FoodDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
  @Autowired
  private FoodDao foodDao;

  @RequestMapping
  @ResponseBody
  public String index() {
    return String.join(", ", foodDao.findFoodNames());
  }
}

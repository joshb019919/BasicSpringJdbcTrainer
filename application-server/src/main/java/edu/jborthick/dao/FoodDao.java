package edu.jborthick.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class FoodDao {
  public JdbcTemplate jdbcTemplate;

  @Autowired
  public void setDataSource(DataSource dataSource) {
    jdbcTemplate = new JdbcTemplate(dataSource);
  }

  public List<String> findFoodNames() {
    return jdbcTemplate.queryForList(
        "SELECT food_name FROM foods",
        String.class
    );
  }
}

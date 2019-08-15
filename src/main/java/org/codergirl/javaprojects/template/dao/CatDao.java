package org.codergirl.javaprojects.template.dao;

import org.codergirl.javaprojects.template.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CatDao {

  @Autowired
  JdbcTemplate jdbcTemplate;

  public List<Cat> getAll() {
    return jdbcTemplate.query("select * from my_schema.cats", new CatRowMapper());
  }
}

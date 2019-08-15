package org.codergirl.javaprojects.template.dao;

import org.codergirl.javaprojects.template.Cat;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CatRowMapper implements RowMapper<Cat> {

  @Override
  public Cat mapRow(ResultSet rs, int i) throws SQLException {
    int id;
    String name;

    id = rs.getInt("id");
    name = rs.getString("name");

    return new Cat(id, name);
  }
}

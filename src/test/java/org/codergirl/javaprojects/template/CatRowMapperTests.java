package org.codergirl.javaprojects.template;

import org.codergirl.javaprojects.template.dao.CatRowMapper;
import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CatRowMapperTests {

    @Test
    public void mapTheCat() throws SQLException {

        ResultSet rs = mock(ResultSet.class);

        when(rs.next()).thenReturn(true);
        when(rs.getInt("id")).thenReturn(314);
        when(rs.getString("name")).thenReturn("Sunshine");

        Cat mappedCat = new CatRowMapper().mapRow(rs, 0);

        Assert.assertEquals(314, mappedCat.getId());
        Assert.assertEquals("Sunshine", mappedCat.getName());

    }
}

package dao;

import model.Yarn;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcYarnDao implements YarnDao {


    private JdbcTemplate jdbcTemplate;

    public JdbcYarnDao(DataSource dataSource) { jdbcTemplate = new JdbcTemplate(dataSource);}

    @Override
    public void addYarn(Yarn yarn) {
        String sql = "INSERT INTO yarn (general_color, manufacturer_color, weight, grams, in_use) " +
                "VALUES(?, ?, ?, ?, ?) RETURNING yarn_id;";
        jdbcTemplate.update(sql, yarn.getGeneralColor(), yarn.getManufacturerColor(), yarn.getWeight(), yarn.getGrams(), yarn.isInUse());
    }

    @Override
    public List<Yarn> retrieveYarnByGeneralColor(String color) {
        List<Yarn> yarn = new ArrayList<>();
        String sql = "SELECT yarn_id, general_color, manufacturer_color, weight, grams, in_use " +
                "FROM yarn " +
                "WHERE general_color = ?;";
        SqlRowSet row = jdbcTemplate.queryForRowSet(sql, color);
        while(row.next()){
            yarn.add(mapRowToYarn(row));
        }
        return yarn;
    }

    @Override
    public List<Yarn> retrieveYarnByManufacturerColor(String color) {
        List<Yarn> yarn = new ArrayList<>();
        String sql = "SELECT yarn_id, general_color, manufacturer_color, weight, grams, in_use " +
                "FROM yarn " +
                "WHERE manufacturer_color = ?;";
        SqlRowSet row = jdbcTemplate.queryForRowSet(sql, color);
        while(row.next()){
            yarn.add(mapRowToYarn(row));
        }
        return yarn;
    }

    @Override
    public void changeYarnUsage(boolean inUse, int yarnId) {
        String sql = "SELECT in_use FROM yarn_id = ?;";
        boolean dbUse = jdbcTemplate.queryForObject(sql,boolean.class, yarnId);
        if(dbUse){
            String sqlSetToFalse = "UPDATE yarn SET in_use = false WHERE yarn_id = ?;";
            jdbcTemplate.update(sql, yarnId);
        } else {
            String sqlSetToTrue = "UPDATE yarn SET in_use = true WHERE yarn_id = ?;";
            jdbcTemplate.update(sql, yarnId);
        }
    }

    @Override
    public void changeGramsAvailable(int grams, int yarnId) {
        String sql = "UPDATE yarn SET grams = ? WHERE yarn_id = ?";
        jdbcTemplate.update(sql, grams, yarnId);
    }

    public Yarn mapRowToYarn(SqlRowSet rowSet){
        Yarn newYarn = new Yarn();
        newYarn.setGeneralColor(rowSet.getString("general_color"));
        newYarn.setManufacturerColor(rowSet.getString("manufacturer_color"));
        newYarn.setWeight(rowSet.getString("weight"));
        newYarn.setGrams(rowSet.getInt("grams"));
        newYarn.setInUse(rowSet.getBoolean("in_use"));
        return newYarn;
    }
}

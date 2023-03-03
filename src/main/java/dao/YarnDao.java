package dao;

import model.Yarn;

import java.util.List;

public interface YarnDao {
    /**Gre */

    //Add yarn by object to database
    void addYarn(Yarn yarn);

    List<Yarn> retrieveYarnByGeneralColor(String color);

    List<Yarn> retrieveYarnByManufacturerColor(String color);

    //set yarn in_use to true or false
    void changeYarnUsage(boolean inUse, int yarnId);


    void changeGramsAvailable(int grams, int yarnId);

}

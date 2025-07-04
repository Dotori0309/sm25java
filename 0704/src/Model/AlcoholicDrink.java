package Model;

import javax.xml.namespace.QName;
import java.io.*;
import java.util.*;

public class AlcoholicDrink extends Drink {

    public double alcoholPercentage;
    public String origin;

    public AlcoholicDrink() {
    }

    public AlcoholicDrink(String name, String brande, String buff, int Volume, int cal, int price, double alcoholPercentage, String origin) {
        super(name, brande, buff, Volume, cal, price);
        this.alcoholPercentage = alcoholPercentage;
        this.origin = origin;
    }

    public void drink() {
        this.Volume = 0;
        System.out.println(name+"꺼억");
    }

    public void checkAlcoholLevel() {
        System.out.println(alcoholPercentage);
    }

    @Override
    public void showInfo() {
    }
}

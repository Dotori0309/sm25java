package Model;

import java.io.*;
import java.util.*;

public class Milk extends Drink {

    public double fatPercentage;
    public int proteinAmount;

    public Milk() {
    }

    public Milk(double fatPercentage, int proteinAmount) {
        this.fatPercentage = fatPercentage;
        this.proteinAmount = proteinAmount;
    }

    public void drink() {
    }

    public void checkNutrition() {
    }

    @Override
    public void showInfo() {
    }
}

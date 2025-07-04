package Model;

import java.io.*;
import java.util.*;

public class IONDrink extends Drink {

    public double electrolyteAmount;
    public int sugarAmount;
    public String flavor;

    public IONDrink() {
    }

    public IONDrink(double electrolyteAmount, int sugarAmount, String flavor) {
        this.electrolyteAmount = electrolyteAmount;
        this.sugarAmount = sugarAmount;
        this.flavor = flavor;
    }

    public void drink() {
    }

    public void replenishElectrolyte() {
    }

    @Override
    public void showInfo() {
    }
}

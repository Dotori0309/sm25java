package Model;

import java.io.*;
import java.util.*;

public class EnergyDrink extends Drink {

    public int caffeineAmount;
    public int taurineAmount;
    public int sugarAmount;

    public EnergyDrink() {
    }

    public EnergyDrink(int caffeineAmount, int taurineAmount, int sugarAmount) {
        this.caffeineAmount = caffeineAmount;
        this.taurineAmount = taurineAmount;
        this.sugarAmount = sugarAmount;
    }

    public void drink() {
    }

    public void showEffect() {
    }

    @Override
    public void showInfo() {
    }
}

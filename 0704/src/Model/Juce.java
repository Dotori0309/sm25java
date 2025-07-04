package Model;

import java.io.*;
import java.util.*;

public class Juce extends Drink {

    public String fruitType;
    public int sugarAmount;
    public int vitaminContent;

    public Juce() {
    }

    public Juce(String fruitType, int sugarAmount, int vitaminContent) {
        this.fruitType = fruitType;
        this.sugarAmount = sugarAmount;
        this.vitaminContent = vitaminContent;
    }

    public void drink() {
    }

    public void showVitaminInfo() {
    }

    @Override
    public void showInfo() {
    }
}

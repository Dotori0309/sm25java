package Model;

import java.io.*;
import java.util.*;

public class Water extends Drink {

    public String sourceOfWater;
    public String expirationDate;
    public int volume;
    public int mineral;

    public Water() {
    }

    public Water(String sourceOfWater, String expirationDate, int volume, int mineral) {
        this.sourceOfWater = sourceOfWater;
        this.expirationDate = expirationDate;
        this.volume = volume;
        this.mineral = mineral;
    }

    public void drink() {
    }

    public void checkPurity() {
    }

    @Override
    public void showInfo() {
    }
}

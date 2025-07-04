package Model;

import java.io.*;
import java.util.*;

public abstract class Drink {

    protected String name;
    protected String brande;
    protected String buff;
    protected int Volume;
    protected int cal;
    protected int price;

    public Drink() {

    }

    public Drink(String name, String brande, String buff, int Volume, int cal, int price) {
        this.name = name;
        this.brande = brande;
        this.buff = buff;
        this.Volume = Volume;
        this.cal = cal;
        this.price = price;
    }

    public abstract void showInfo();
}

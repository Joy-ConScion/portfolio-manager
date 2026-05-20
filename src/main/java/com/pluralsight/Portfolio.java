package com.pluralsight;

import java.util.ArrayList;
import java.util.Comparator;

public class Portfolio implements Valuable{

    String name;
    String owner;
    ArrayList<Valuable> assets;

    public Portfolio(String name, String owner, ArrayList<Valuable> assets) {
        this.name = name;
        this.owner = owner;
        this.assets = assets;
    }

    public void addAsset(String name, double marketValue){


    }

    @Override
    public double getValue() {

        return assets.stream().mapToDouble(Valuable::getValue).sum();
    }

    public double getMostValuable() {
        return assets.stream()
                .mapToDouble(Valuable::getValue)
                .max()
                .orElse(0);
    }

    public double getLeastValuable(){
        return assets.stream()
                .mapToDouble(Valuable::getValue)
                .min()
                .orElse(0);    }

}

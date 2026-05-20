package com.pluralsight;

import java.util.ArrayList;

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
        String[] assetFields = line.split("\\|");
        FixedAsset asset = new FixedAsset()
        assets.add(asset);

    }

    @Override
    public double getValue() {
        return 0;
    }

}

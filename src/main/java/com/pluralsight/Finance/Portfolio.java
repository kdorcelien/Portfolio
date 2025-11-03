package com.pluralsight.Finance;

import java.util.ArrayList;

public class Portfolio implements Valuable{
    private String name, owner;
    private ArrayList<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    @Override
    public double getValue() {
        double totalValue = 0;
       for (Valuable asset : this.assets ){
           totalValue += asset.getValue();
       }
        return totalValue;
    }

    public void addAsset(Valuable asset) {
        this.assets.add(asset);
    }

    public Valuable getMostValuable() {
        if (assets.isEmpty()) {
            System.out.println("Welcome to the brokeness clud");
            return null;
        }
        Valuable mostValuable = assets.get(0);
        for (Valuable asset : assets) {
            if (asset.getValue() < mostValuable.getValue()) {
                mostValuable = asset;
            }
        }
        return mostValuable;

    }
    public Valuable getLeastValuable() {
        if (assets.isEmpty()) {
            System.out.println("Welcome to the brokeness clud");
            return null;
        }
        Valuable leastValuable = assets.get(0);
        for (Valuable asset : assets) {
            if (asset.getValue() < leastValuable.getValue()) {
                leastValuable = asset;  // Found a lower value!
            }
        }
        return leastValuable;
    }
}

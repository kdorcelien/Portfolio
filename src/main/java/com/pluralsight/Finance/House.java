package com.pluralsight.Finance;

public class House extends FixedAsset implements Valuable{
    private int yearBuilt, squareFeet, bedRooms;

    public House(String name, double marketValue) {
        super(name, marketValue);
    }

    @Override
    public double getValue() {
        return super.getValue();
    }
}

package com.pluralsight.Finance;

public class Jewelry extends FixedAsset implements Valuable{
    private double karat;

    public Jewelry(String name, double marketValue) {
        super(name, marketValue);
    }

    @Override
    public double getValue() {
        return super.getValue();
    }
}

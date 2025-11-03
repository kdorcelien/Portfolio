package com.pluralsight.Finance;

public class Gold extends FixedAsset implements Valuable {
    private double weight;

    public Gold(String name, double marketValue) {
        super(name, marketValue);
    }

    @Override
    public double getValue() {
        return super.getValue();
    }
}

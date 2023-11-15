package com.pluralsight.finance;

public class Jewelry extends FixedAsset{
    private double karat;

    public Jewelry(String name, double value, double karat) {
        super(name, value);
        this.karat = karat;
    }

    @Override
    public double getValue() {
        return super.getValue() * 9.2;
    }

    @Override
    public String toString() {
        return "Jewelry{" +
                "karat=" + karat +
                '}';
    }
}

package com.pluralsight.finance;

public class House extends FixedAsset{
    private int yearBuilt;
    private int squareBuilt;
    private int bedrooms;

    public House(String name, double value, int yearBuilt, int squareBuilt, int bedrooms) {
        super(name, value);
        this.yearBuilt = yearBuilt;
        this.squareBuilt = squareBuilt;
        this.bedrooms = bedrooms;
    }

    @Override
    public double getValue() {
        return super.getValue() * 1000;
    }
}

package com.pluralsight;

import java.time.LocalDate;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        int currentYear = LocalDate.now().getYear();
        int carAge = currentYear - this.year;
        double value = 0;

        // determine car value
        if (carAge <= 3){
            for (int i = 0; i <= carAge; i++) {
                value = getOriginalCost() * 0.97;
            }
        }
        if (carAge >= 4 && carAge <= 6){
            for (int i = 0; i <= carAge; i++) {
                value = getOriginalCost() * 0.94;
            }
        }
        if (carAge >= 7 && carAge <= 10){
            for (int i = 0; i <= carAge; i++) {
                value = getOriginalCost() * 0.92;
            }
        }
        if (carAge < 10) {
            value = getOriginalCost() - 1000;
        }

        // reduce final
        if(!makeModel.contains("honda") || !makeModel.contains("toyota") && odometer > 100000){
                value *= 0.75;
        }

    return value;
    }
}

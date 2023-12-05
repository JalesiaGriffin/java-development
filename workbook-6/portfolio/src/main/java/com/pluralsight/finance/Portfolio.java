package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.List;

public class Portfolio implements Comparable{
    private String name;
    private String owner;
    private List<IValuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<IValuable>();
    }

    public void add(IValuable valuable){
        assets.add(valuable);
    }

    public double getValue() {
        double total = 0;

        for(IValuable valuable: assets){
            total += valuable.getValue();
        }

        return 0;
    }

    public IValuable getMostValuable(){
        IValuable mostValuable = assets.get(0);
        for (int i = 0; i < assets.size(); i++){
            if(mostValuable.getValue() < assets.get(i).getValue()){
                mostValuable = assets.get(i);
            }
        }
        return mostValuable;
    }

    public IValuable getLeastValuable(){
        IValuable leastValuable = assets.get(0);
        for (int i = 0; i < assets.size(); i++){
            if(leastValuable.getValue() > assets.get(i).getValue()){
                leastValuable = assets.get(i);
            }
        }
        return leastValuable;
    }
}

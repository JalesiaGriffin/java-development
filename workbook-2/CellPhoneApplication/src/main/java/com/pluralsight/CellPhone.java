package com.pluralsight;

public class CellPhone {
    private int serialNum;
    private String model;
    private String carrier;
    private String phoneNum;
    private String owner;

    public CellPhone() {
        this.serialNum = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNum = "";
        this.owner = "";
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void dial (String phoneNum) {
        System.out.println(this.owner + "'s phone is calling " + phoneNum);
    }
}

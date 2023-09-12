package com.designPatterns;

public class AdapterPatterns {


}
interface PriceCalculator{
    public String calculatePrice();
}

class CarPriceCalculator implements PriceCalculator{
 private int age;

    public CarPriceCalculator(int age, String model) {
        this.age = age;
        this.model = model;
    }

    private String model;

    @Override
    public String calculatePrice() {
        return null;
    }
}

class TruckPriceCalculator implements PriceCalculator{
    private int age;
    private int mileage;
    public static int averagePrice=10000;

    public TruckPriceCalculator(int age, int mileage) {
        this.age = age;
        this.mileage = mileage;
    }

    @Override
    public String calculatePrice() {
        int price = Math.max(averagePrice - age*100 -mileage/100,0);
        return price + "USD";
    }
}
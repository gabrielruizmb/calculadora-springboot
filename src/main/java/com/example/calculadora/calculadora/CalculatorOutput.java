package com.example.calculadora.calculadora;

public class CalculatorOutput {
    private int listSize;
    private double smallestNumber;
    private double biggestNumber;
    //private double average;

    public CalculatorOutput(int listSize, double smallestNumber, double biggestNumber) {
        this.listSize = listSize;
        this.smallestNumber = smallestNumber;
        this.biggestNumber = biggestNumber;
    }
    
    public int getListSize() {
        return listSize;
    }

    public void setListSize(int listSize) {
        this.listSize = listSize;
    }

    public double getSmallestNumber() {
        return smallestNumber;
    }

    public void setSmallestNumber(double smallestNumber) {
        this.smallestNumber = smallestNumber;
    }

    public double getBiggestNumber() {
        return biggestNumber;
    }

    public void setBiggestNumber(double biggestNumber) {
        this.biggestNumber = biggestNumber;
    }

    // public double getAverage() {
    //     return average;
    // }

    // public void setAverage(double average) {
    //     this.average = average;
    // }

}


package com.example.calculadora.calculadora;

public class CalculatorOutput {
    private int listSize;
    private double smallestNumber;
    private double biggestNumber;

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

}


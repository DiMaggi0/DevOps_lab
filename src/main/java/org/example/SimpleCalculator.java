package org.example;

import java.util.List;

public class SimpleCalculator {
    private final double firstNumber, secondNumber;
    public SimpleCalculator(String[] arr){
        this.firstNumber = Double.parseDouble(arr[0]);
        this.secondNumber = Double.parseDouble(arr[2]);
    }
    public Double operation1(){
        return this.firstNumber + this.secondNumber;
    }
    public Double operation2(){
        return this.firstNumber - this.secondNumber;
    }
    public Double operation3(){
        return this.firstNumber*this.secondNumber;
    }
    public Double operation4(){
        return this.firstNumber / this.secondNumber;
    }
    public Double operation5(){
        return Math.pow(this.firstNumber, this.secondNumber);
    }
}

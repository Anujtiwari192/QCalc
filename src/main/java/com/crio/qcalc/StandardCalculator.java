package com.crio.qcalc;


public class StandardCalculator {

    private double result;
    
    public StandardCalculator(){
    }

  
    public void add(int num1, int num2){
   // this.setResult( num1+num2);
     result = (double)num1 + (double)num2;
    }

    public void add(double num1, double num2){
        result = num1 + num2;
    }
    

    public void subtract(int num1, int num2){
    //this.setResult(num1-num2);
    result = (double)num1 - (double)num2;
    }

    public void subtract(double num1, double num2){
        result = num1-num2;
    }


    public void multiply(int num1, int num2){
    //this.setResult(num1*num2);
    result = (double)num1 * (double)num2;
    }

    public void multiply(double num1, double num2){
        result = num1*num2;
    }

    public void divide(int num1, int num2){

    //this.setResult(num1/num2);
    result = (double)num1 / (double)num2;
    }

    public void divide(double num1, double num2){
        result = num1/num2;
    }

    public double getResult(){
        return result;
    }

    public void setResult(int value){
        if ((double)value != (double)0)

           return;
       this.result = (double)value;
    }

    public void clearResult() {

        result = (double)0;

    }

    public void printResult(){

        System.out.println("Standard Calculator Result:"+ result);

    }
    
    public static void getVersion(){

        System.out.println("Standard Calculator 1.0");

    }


}
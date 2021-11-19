package com.codechef;
public class Main {

    public static void main(String[] args) {
	// Exceptional handling by using try catch block;
   try{
       int a = 100/0;
   }
   catch (ArithmeticException e){
       System.out.println("we can not divide any number by 0");
   }
    }
}

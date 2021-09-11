/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 5
 *  Copyright 2021 Mayank Goyal
 */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);

   System.out.println("What is the first number? ");
   int number1 = scanner.nextInt();

   System.out.println("What is the second number? ");
   int number2 = scanner.nextInt();

   System.out.println(number1 + " + " + number2 + " = " + (number1+number2));
   System.out.println(number1 + " - " + number2 + " = " + (number1-number2));
   System.out.println(number1 + " * " + number2 + " = " + (number1*number2));
   System.out.println(number1 + " / " + number2 + " = " + (number1/number2));
      
  }
}
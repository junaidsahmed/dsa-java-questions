package org.algos.questions;

import static java.lang.StringTemplate.STR;

/**
 * @author Junaid Shakeel
 */
public class Fibonacci {

    public static void main(String[] args) {

    }


    // generate Fibonacci series
    //time complexity O(n)
    static void generateFibonacciSeries(int num) {

        var first = 0;
        var second = 1;
        for (int i = 0; i <= num; i++) {
            System.out.print(STR."\{first} ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    // generate Fibonacci series using Recursion
    //time complexity O(2^n) because of two recursive calls
    static int generateFibonacciSeriesRecursion(int num){

        if(num == 0)
            return 0;

        if(num ==1 || num ==2 )
            return 1;
        return generateFibonacciSeriesRecursion(num-1) + generateFibonacciSeriesRecursion(num-  2);

    }

    //number is part of Fibonacci series or not
    //time complexity O(n)
   static boolean isNumberFibonacci(int num){

        var first = 0;
        var second= 1;

        if(num== first || num==second)
            return true;

        for (int i = 0 ; i<= num ; i++){

            int next = first+second;

            first= second;
            second = next;
            if(next== num){
                return true;
            }

        }
        return false;
    }


    static boolean isPerfectSquare(int num){

        var sq = (int) Math.sqrt(num);
        return sq*sq== num;
    }

   // check two equations 5x^2 + 4 or 5x^2 - 4 one them must be perfect square if num is part of Fibonacci
   static boolean isNumberFibonacciUsingEquation(int num){
        return isPerfectSquare(((5*num*num) + 4)) || isPerfectSquare(((5*num*num) - 4));

   }
}

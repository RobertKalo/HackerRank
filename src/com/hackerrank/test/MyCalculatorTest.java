package com.hackerrank.test;
import java.util.Scanner;

/**
 * Created by Kaló Róbert on 2017. 04. 20..
 */

class MyCalculator {

    public int power(int n, int p) throws Exception {

        if (n < 0 | p < 0) throw new Exception("java.lang.Exception: n and p should be non-negative");
        else return (int) Math.pow(n, p);
    }

}

public class MyCalculatorTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while ( in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            MyCalculator my_calculator = new MyCalculator();
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            } finally {
				in.close();
			}
        }
    }
}

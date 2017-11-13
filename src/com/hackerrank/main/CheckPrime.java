/*You are given a class solution and its main method in the editor. your task is to create a class prime. the class prime should contain a single method checkprime.

the locked code in the editor will call the checkprime method with one or more integer arguments. you should write the checkprime method in such a way that the code prints only the prime numbers.

please read the code given in the editor carefully. also please do not use method overloading!

note: you may get a compile time error in this problem due to the statement below:

  bufferedreader br=new bufferedreader(new inputstreamreader(in));
this was added intentionally, and you have to figure out a way to get rid of the error.

input format

there are only five lines of input, each containing one integer.

output format

there will be only four lines of output. each line contains only prime numbers depending upon the parameters passed to checkprime in the main method of the class solution. in case there is no prime number, then a blank line should be printed.

sample input

2
1
3
4
5
sample output

2 
2 
2 3 
2 3 5*/

package com.hackerrank.main;

import java.io.*;
import java.util.*;
import java.lang.reflect.*;

import static java.lang.System.in;

class Prime {

	public void checkPrime( int... numbers ) {

		String result = "";
		
		
		for ( int number : numbers ) {
			if ( isPrime( number ) ) {
				result += number + " ";
			}
		}

		System.out.println( result );

	}

	boolean isPrime( int n ) {
		if ( ( n < 2 ) || ( ( n > 2 ) && ( n % 2 == 0 ) ) ) return false;
		for ( int i = 3; i * i <= n; i += 2 ) {
			if ( n % i == 0 ) return false;
		}
		return true;
	}

}

public class CheckPrime {

	public static void main( String[] args ) {
		try {
			BufferedReader br = new BufferedReader( new InputStreamReader( in ) ); 
			int n1 = Integer.parseInt( br.readLine() );
			int n2 = Integer.parseInt( br.readLine() );
			int n3 = Integer.parseInt( br.readLine() );
			int n4 = Integer.parseInt( br.readLine() );
			int n5 = Integer.parseInt( br.readLine() );
			Prime ob = new Prime();
			ob.checkPrime( n1 );
			ob.checkPrime( n1, n2 );
			ob.checkPrime( n1, n2, n3 );
			ob.checkPrime( n1, n2, n3, n4, n5 );
			Method[] methods = Prime.class.getDeclaredMethods();
			Set<String> set = new HashSet<>();
			boolean overload = false;
			for ( int i = 0; i < methods.length; i++ ) {
				if ( set.contains( methods[i].getName() ) ) {
					overload = true;
					break;
				}
				set.add( methods[i].getName() );

			}
			if ( overload ) {
				throw new Exception( "Overloading not allowed" );
			}
		} catch ( Exception e ) {
			System.out.println( e );
		}
	}

}

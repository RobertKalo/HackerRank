/*Cryptographic hash functions are mathematical operations run on digital data; by comparing the computed hash (i.e., the output produced by executing a hashing algorithm) to a known and expected hash value, a person can determine the data's integrity. For example, computing the hash of a downloaded file and comparing the result to a previously published hash result can show whether the download has been modified or tampered with. In addition, cryptographic hash functions are extremely collision-resistant; in other words, it should be extremely difficult to produce the same hash output from two different input values using a cryptographic hash function.

Secure Hash Algorithm 2 (SHA-2) is a set of cryptographic hash functions designed by the National Security Agency (NSA). It consists of six identical hashing algorithms (i.e., SHA-256, SHA-512, SHA-224, SHA-384, SHA-512/224, SHA-512/256) with a variable digest size. SHA-256 is a -bit ( byte) hashing algorithm which can calculate a hash code for an input of up to  bits. It undergoes  rounds of hashing and calculates a hash code that is a -digit hexadecimal number.

Given a string, , print its SHA-256 hash value.

Input Format
A single alphanumeric string denoting .

Constraints

String  consists of English alphabetic letters (i.e.,  and/or decimal digits (i.e.,  through ) only.
Output Format

Print the SHA-256 encryption value of  on a new line.

Sample Input 0

HelloWorld
Sample Output 0

872e4e50ce9990d8b041330c47c9ddd11bec6b503ae9386a99da8584e9bb12c4
Sample Input 1

Javarmi123
Sample Output 1

f1d5f8d75bb55c777207c251d07d9091dc10fe7d6682db869106aacb4b7df678
Submissions: 1888
Max Score: 30
Difficulty: Medium
Rate This Challenge:

More
Current Buffer (saved locally, editable)     
 */
package com.hackerrank.main;

import java.security.MessageDigest;
import java.util.Scanner;

public class JavaSHA256 {

	public static void main( String[] args ) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to
		 * STDOUT. Your class should be named Solution.
		 */
		try {
			Scanner scanner = new Scanner( System.in );
			String word = scanner.nextLine();
			scanner.close();

			MessageDigest messageDigest = MessageDigest.getInstance( "SHA-256" );
			messageDigest.update( word.getBytes("UTF-8") );
			byte[] byteHash = messageDigest.digest();

			for ( byte b : byteHash ) {
				System.out.format( "%02x", b );
			}

		} catch ( Exception e ) {
			e.printStackTrace();
		}
	}
}
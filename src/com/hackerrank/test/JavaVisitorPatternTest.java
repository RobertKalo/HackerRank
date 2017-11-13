package com.hackerrank.test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;

import com.hackerrank.main.JavaVisitorPattern;

public class JavaVisitorPatternTest {

	private final ByteArrayOutputStream	outContent	= new ByteArrayOutputStream();
	private final ByteArrayOutputStream	errContent	= new ByteArrayOutputStream();

	// @Before
	public void setUpStreams() {
		System.setOut( new PrintStream( outContent ) );
		System.setErr( new PrintStream( errContent ) );
	}

	// @After
	public void cleanUpStreams() {
		System.setOut( null );
		System.setErr( null );
	}

	@Test
	public void testMain() throws IOException {
		 System.out.println( "main" );
		String[] args = null;
		// String data = "5\r\n" +
//				"4 7 2 5 12\r\n" +
//				"0 1 0 0 1\r\n" +
//				"1 2\r\n" +
//				"1 3\r\n" +
//				"3 4\r\n" +
//				"3 5";
//				
				String data = "100\r\n" + 
						"237 945 785 695 165 919 740 706 67 342 6 282 965 39 441 922 87 555 936 550 860 972 448 577 931 542 733 374 977 335 709 440 850 493 729 478 871 538 189 557 356 737 341 946 875 969 198 315 376 540 84 216 3 833 51 310 992 898 27 52 670 141 629 770 903 355 834 43 156 882 48 317 959 842 776 671 312 931 640 368 525 900 824 485 292 90 665 646 748 73 636 619 992 603 248 946 472 778 601 935\r\n" + 
						"0 0 0 0 1 0 0 1 1 0 1 1 0 1 0 1 0 1 1 0 0 1 1 1 0 0 1 0 0 0 1 1 0 0 0 0 1 1 1 1 0 0 0 0 1 1 1 1 1 0 0 1 0 1 0 1 1 0 1 1 0 0 0 0 1 0 0 0 0 0 0 1 1 1 0 0 1 1 1 0 0 0 1 0 0 1 0 0 1 0 0 0 0 1 0 0 0 1 1 0\r\n" + 
						"1 97\r\n" + 
						"1 4\r\n" + 
						"1 5\r\n" + 
						"1 55\r\n" + 
						"1 72\r\n" + 
						"1 73\r\n" + 
						"1 42\r\n" + 
						"1 75\r\n" + 
						"1 12\r\n" + 
						"1 78\r\n" + 
						"1 48\r\n" + 
						"1 82\r\n" + 
						"1 51\r\n" + 
						"1 83\r\n" + 
						"1 87\r\n" + 
						"1 89\r\n" + 
						"1 90\r\n" + 
						"1 32\r\n" + 
						"1 94\r\n" + 
						"1 70\r\n" + 
						"2 4\r\n" + 
						"2 9\r\n" + 
						"2 10\r\n" + 
						"2 11\r\n" + 
						"2 13\r\n" + 
						"2 15\r\n" + 
						"2 17\r\n" + 
						"2 19\r\n" + 
						"2 20\r\n" + 
						"2 31\r\n" + 
						"2 41\r\n" + 
						"2 44\r\n" + 
						"2 45\r\n" + 
						"2 53\r\n" + 
						"2 61\r\n" + 
						"2 62\r\n" + 
						"2 64\r\n" + 
						"2 66\r\n" + 
						"2 79\r\n" + 
						"2 88\r\n" + 
						"2 92\r\n" + 
						"2 93\r\n" + 
						"2 100\r\n" + 
						"3 33\r\n" + 
						"3 99\r\n" + 
						"3 68\r\n" + 
						"3 5\r\n" + 
						"3 47\r\n" + 
						"3 80\r\n" + 
						"3 57\r\n" + 
						"3 26\r\n" + 
						"3 59\r\n" + 
						"4 67\r\n" + 
						"4 36\r\n" + 
						"4 34\r\n" + 
						"4 43\r\n" + 
						"4 56\r\n" + 
						"4 14\r\n" + 
						"4 81\r\n" + 
						"4 24\r\n" + 
						"4 58\r\n" + 
						"4 91\r\n" + 
						"5 65\r\n" + 
						"5 69\r\n" + 
						"5 7\r\n" + 
						"5 8\r\n" + 
						"5 35\r\n" + 
						"5 84\r\n" + 
						"5 85\r\n" + 
						"5 54\r\n" + 
						"5 23\r\n" + 
						"5 27\r\n" + 
						"6 33\r\n" + 
						"6 98\r\n" + 
						"6 76\r\n" + 
						"6 16\r\n" + 
						"6 22\r\n" + 
						"6 29\r\n" + 
						"6 95\r\n" + 
						"7 49\r\n" + 
						"7 52\r\n" + 
						"7 28\r\n" + 
						"7 74\r\n" + 
						"8 77\r\n" + 
						"8 30\r\n" + 
						"8 71\r\n" + 
						"8 40\r\n" + 
						"9 60\r\n" + 
						"9 37\r\n" + 
						"9 63\r\n" + 
						"9 39\r\n" + 
						"10 96\r\n" + 
						"11 38\r\n" + 
						"12 50\r\n" + 
						"16 46\r\n" + 
						"18 97\r\n" + 
						"19 25\r\n" + 
						"21 98\r\n" + 
						"23 86";
		final InputStream original = System.in;
		System.setIn( new ByteArrayInputStream( data.getBytes() ) );
		// final FileInputStream fips = new FileInputStream(new
		// File("[path_to_file]"));
		// System.setIn(fips);
		setUpStreams();
		JavaVisitorPattern.main( args );
		// assertEquals( 	"24\r\n" +
					//	"40\r\n" +
//						"15", outContent.toString().trim() );
	
		System.setIn( original );
		cleanUpStreams();
		assertEquals( "45136\r\n" + 
				"56618427\r\n" + 
				"14333", outContent.toString().trim() );

	}

}

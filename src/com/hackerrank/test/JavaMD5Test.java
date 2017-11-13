package com.hackerrank.test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;

import com.hackerrank.main.JavaMD5;

public class JavaMD5Test {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	// @Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}

	// @After
	public void cleanUpStreams() {
		System.setOut(null);
		System.setErr(null);
	}

	@Test
	public void testMain() throws IOException {
//		System.out.println("main");
		String[] args = null;
		String data = "HelloWorld";
		final InputStream original = System.in;
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		// final FileInputStream fips = new FileInputStream(new
		// File("[path_to_file]"));
		// System.setIn(fips);
		setUpStreams();
		JavaMD5.main(args);

		System.setIn(original);
		cleanUpStreams();
		assertEquals("68e109f0f40ca72a15e05cc22786f8e6", outContent.toString().trim());

	}

	@Test
	public void testMain2() throws IOException {
		System.out.println("main");
		String[] args = null;
		String data = "Javarmi123";
		final InputStream original = System.in;
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		// final FileInputStream fips = new FileInputStream(new
		// File("[path_to_file]"));
		// System.setIn(fips);
		setUpStreams();
		JavaMD5.main(args);

		System.setIn(original);
		cleanUpStreams();
		assertEquals("2da2d1e0ce7b4951a858ed2d547ef485", outContent.toString().trim());

	}
	
}

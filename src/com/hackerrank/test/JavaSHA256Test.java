package com.hackerrank.test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;

import com.hackerrank.main.JavaSHA256;

public class JavaSHA256Test {

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
		JavaSHA256.main(args);

		System.setIn(original);
		cleanUpStreams();
		assertEquals("872e4e50ce9990d8b041330c47c9ddd11bec6b503ae9386a99da8584e9bb12c4", outContent.toString().trim());

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
		JavaSHA256.main(args);

		System.setIn(original);
		cleanUpStreams();
		assertEquals("f1d5f8d75bb55c777207c251d07d9091dc10fe7d6682db869106aacb4b7df678", outContent.toString().trim());

	}
	
}

package com.hackerrank.main;

public class Flower {

	String whatsYourName() {
		return "I have many names and types.";
	}
}

class Jasmine extends Flower{
	@Override
	String whatsYourName() {
		return "Jasmine";
	}
}

class Lily extends Flower{
	@Override
	String whatsYourName() {
		return "Lily";
	}
}

class Lotus extends Flower{
	@Override
	String whatsYourName() {
		return "Lotus";
	}
}

class State {
	Flower yourNationalFlower() {
		Flower flower = new Flower();
		return flower;
	}
}

class WestBengal extends State {
	@Override
	Jasmine yourNationalFlower() {
		Jasmine flower = new Jasmine();
		return flower;
	}
}

class Karnataka extends State {
	@Override
	Lotus yourNationalFlower() {
		Lotus flower = new Lotus();
		return flower;
	}
}

class AndhraPradesh extends State {
	@Override
	Lily yourNationalFlower() {
		Lily flower = new Lily();
		return flower;
	}
}

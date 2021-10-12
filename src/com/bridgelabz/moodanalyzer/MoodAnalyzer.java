package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {

	private String message;
	
	public MoodAnalyzer() {}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyseMood() {
		if (message.toLowerCase().indexOf("sad") != -1)
			return "SAD";
		else
			return "HAPPY";
	}

	public static void main(String[] args) {
		System.out.println("Welcome to mood analyzer program");
	}
}

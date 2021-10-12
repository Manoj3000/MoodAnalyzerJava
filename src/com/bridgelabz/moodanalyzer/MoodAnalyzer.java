package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {

	public String analyseMood(String message) {
		if (message.toLowerCase().indexOf("sad") != -1)
			return "SAD";
		else
			return "HAPPY";
	}

	public static void main(String[] args) {
		System.out.println("Welcome to mood analyzer program");
	}
}

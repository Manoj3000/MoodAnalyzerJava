package com.bridgelabz.moodanalyzer;

import com.bridgelabz.exception.ErrorMessages;
import com.bridgelabz.exception.MoodAnalysisException;

public class MoodAnalyzer {

	private String message;
	
	public MoodAnalyzer() {}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyseMood() throws MoodAnalysisException {
		
		if(message.trim().isEmpty()) {
			throw new MoodAnalysisException(ErrorMessages.INVALID_DATA.get());			
		}
		
		try {
			if (message.toLowerCase().indexOf("sad") != -1)
				return "SAD";
			else
				return "HAPPY";
		} catch (NullPointerException e) {
			throw new MoodAnalysisException(ErrorMessages.INVALID_DATA.get());
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to mood analyzer program");
	}
}

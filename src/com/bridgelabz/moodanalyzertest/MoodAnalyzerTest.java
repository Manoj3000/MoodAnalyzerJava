package com.bridgelabz.moodanalyzertest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.bridgelabz.moodanalyzer.MoodAnalyzer;

public class MoodAnalyzerTest {
	
	@Test
	public void analyseMoodForSad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
		String res = moodAnalyzer.analyseMood();
		assertEquals("SAD", res);
	}

	@Test
	public void analyseMoodForHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
		String res = moodAnalyzer.analyseMood();
		assertEquals("HAPPY", res);
	}
}

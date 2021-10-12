package com.bridgelabz.moodanalyzertest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.bridgelabz.exception.MoodAnalysisException;
import com.bridgelabz.moodanalyzer.MoodAnalyzer;

public class MoodAnalyzerTest {
	
	@Test
	public void analyseMoodForSad() throws MoodAnalysisException {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
		String res = moodAnalyzer.analyseMood();
		assertEquals("SAD", res);
	}

	@Test
	public void analyseMoodForHappy() throws MoodAnalysisException {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
		String res = moodAnalyzer.analyseMood();
		assertEquals("HAPPY", res);
	}
	
	@Test(expected = NullPointerException.class)
	public void analyseMoodForNull() throws MoodAnalysisException {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String res = moodAnalyzer.analyseMood();
		assertEquals("Please enter a valid mood", res);
	}
}

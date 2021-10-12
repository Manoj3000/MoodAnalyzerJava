package com.bridgelabz.moodanalyzertest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.bridgelabz.moodanalyzer.MoodAnalyzer;

public class MoodAnalyzerTest {
	
	MoodAnalyzer moodAnalyzer = null;

    @Before
    public void setUp(){
    	moodAnalyzer = new MoodAnalyzer();
    }
	
	@Test
	public void analyseMoodForSad() {
		String res = moodAnalyzer.analyseMood("I am in Sad Mood");
		assertEquals("SAD", res);
	}

	@Test
	public void analyseMoodForHappy() {
		String res = moodAnalyzer.analyseMood("I am in Any Mood");
		assertEquals("HAPPY", res);
	}
}

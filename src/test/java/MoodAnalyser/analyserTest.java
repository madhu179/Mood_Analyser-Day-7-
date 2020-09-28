package MoodAnalyser;

import static org.junit.Assert.*;

import org.junit.Test;



public class analyserTest {
	@Test 
	public void test_Given_SAD_Mood_returns_SAD() {
        analyserMain am = new analyserMain();   
        assertEquals("SAD",am.analyseMood("I am in sad mood"));
    }
	
	@Test 
	public void test_Given_ANY_Mood_returns_HAPPY() {
        analyserMain am = new analyserMain();   
        assertEquals("HAPPY",am.analyseMood("I am in any mood"));
    }

}

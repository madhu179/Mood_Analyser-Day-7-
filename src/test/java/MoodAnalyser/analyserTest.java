package MoodAnalyser;

import static org.junit.Assert.*;

import org.junit.Test;



public class analyserTest {
	@Test 
	public void test_Given_SAD_Mood_returns_SAD() {
        analyserMain am = new analyserMain("I am in sad mood");   
        assertEquals("SAD",am.analyseMood());
    }
	
	@Test 
	public void test_Given_ANY_Mood_returns_HAPPY() {
        analyserMain am = new analyserMain("I am in any mood");   
        assertEquals("HAPPY",am.analyseMood());
    }
	
	@Test
	public void test_Given_NUll_returns_HAPPY()
	{
		analyserMain am = new analyserMain(null);   
        assertEquals("HAPPY",am.analyseMood());
	}

}

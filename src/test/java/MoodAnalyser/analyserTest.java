package MoodAnalyser;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.rules.ExpectedException;



public class analyserTest {
	@Test 
	public void test_Given_SAD_Mood_returns_SAD() {
        analyserMain am = new analyserMain("I am in sad mood");   
        try {
			assertEquals("SAD",am.analyseMood());
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
    }

	@Test 
	public void test_Given_ANY_Mood_returns_HAPPY() {
        analyserMain am = new analyserMain("I am in any mood");   
        try {
			assertEquals("HAPPY",am.analyseMood());
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
    }
	
	@Test
	public void test_Given_NUll_returns_Exception_MSG()
	{
		analyserMain am = new analyserMain(null);   
        try { 	
        	am.analyseMood();  
		} catch (MoodAnalysisException e) {
			assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL,e.type);
		}
	}
	
	@Test
	public void test_Given_EMPTY_returns_Exception_MSG()
	{
		analyserMain am = new analyserMain("");   
        try {
        	am.analyseMood();  
		} catch (MoodAnalysisException e) {
			assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,e.type);
		}
	}
	

}

package MoodAnalyser;

public class analyserMain {

	public String analyseMood(String msg)  {
		if(msg.contains("sad"))
		{
		return "SAD";
		}
		
		else
		{
		return "HAPPY";
		}	
	}

}

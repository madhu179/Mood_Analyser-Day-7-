package MoodAnalyser;

import MoodAnalyser.MoodAnalysisException.ExceptionType;

public class analyserMain {
	private String msg;
	
	public analyserMain()
	{
		
	}
	
	public analyserMain(String msg)
	{
		this.msg = msg;
	}

	public String analyseMood() throws MoodAnalysisException {
		try {
		if(msg.length()==0)
		{
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,"Please enter proper message");
		}
		if(msg.contains("sad"))
		{
		return "SAD";
		}
		
		else
		{
		return "HAPPY";
		}	
		}catch(NullPointerException e)
		{
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,"Please enter proper message");
		}
		
	}

}

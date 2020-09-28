package MoodAnalyser;

public class analyserMain {
	private String msg;
	
	public analyserMain()
	{
		
	}
	
	public analyserMain(String msg)
	{
		this.msg = msg;
	}

	public String analyseMood()  {
		try {
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
			return "HAPPY";
		}
		
	}

}

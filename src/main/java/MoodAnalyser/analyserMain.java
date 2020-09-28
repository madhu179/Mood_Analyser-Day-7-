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

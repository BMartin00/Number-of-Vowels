package numberOfVowels;

public class CountingVowelsExceptionHandler extends Exception
{
	String message;
	
	public CountingVowelsExceptionHandler(String errMessage)
	{
		message = errMessage;
	}
	
	public String getMessage()
	{
		return message;
	}
}
package numberOfVowels;

public class CountingVowels
{
	public boolean validateString(String text) throws CountingVowelsExceptionHandler
	{
		if(text.length() < 0 || text.length() > 75)
		{
			throw new CountingVowelsExceptionHandler("Invalid length");
		}
		return true;
		
//		throw new RuntimeException("No code written");
	}
	
	public int countVowels(String text) throws CountingVowelsExceptionHandler
	{
		validateString(text);
		
		int numberOfVowels = 0;
		
		for (int i = 0 ; i < text.length(); i++)
		{
			char ch = text.charAt(i);
			if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'|| ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U')
			{
				numberOfVowels++;
			}
		}
		return numberOfVowels;
		
//		throw new RuntimeException("No code written");
	}
}

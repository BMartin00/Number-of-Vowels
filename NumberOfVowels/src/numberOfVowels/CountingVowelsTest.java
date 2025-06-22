package numberOfVowels;

import junit.framework.TestCase;

public class CountingVowelsTest extends TestCase
{
	/* validateString */
	//Test #: 1
	//Obj: Test valid minimum boundary value (length 1)
	//Input(s): "H"
	//Expected Output: True
	
	public void testvalidateString001()
	{
		CountingVowels testObj = new CountingVowels();
		
		try
		{
			boolean result = testObj.validateString("H");
			assertEquals(true, result);
		}
		catch(CountingVowelsExceptionHandler e)
		{
			fail("No Exception Expected");
		}
	}
	
	//Test #: 2
	//Obj: Test valid maximum boundary value (length 75)
	//Input(s): "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvw"
	//Expected Output: True
	
	public void testvalidateString002()
	{
		CountingVowels testObj = new CountingVowels();
		
		try
		{
			boolean result = testObj.validateString("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvw");
			assertEquals(true, result);
		}
		catch(CountingVowelsExceptionHandler e)
		{
			fail("No Exception Expected");
		}
	}
	
	//Test #: 3
	//Obj: Test just below minimum boundary value (length 0)
	//Input(s): ""
	//Expected Output: True
	
	public void testvalidateString003()
	{
		CountingVowels testObj = new CountingVowels();
		
		try
		{
			boolean result = testObj.validateString("");
			assertEquals(true, result);
		}
		catch(CountingVowelsExceptionHandler e)
		{
			fail("No Exception Expected");
		}
	}
	
	//Test #: 4
	//Obj: Test invalid just above maximum boundary value (length 76)
	//Input(s): "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwx"
	//Expected Output: CountingVowelsExceptionHandler Thrown with message "Invalid length"
	
	public void testvalidateString004()
	{
		CountingVowels testObj = new CountingVowels();
		
		try
		{
			testObj.validateString("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwx");
			fail("Exception is Expected");
		}
		catch(CountingVowelsExceptionHandler e)
		{
			assertEquals("Invalid length", e.getMessage());
		}
	}
	
	//Test #: 5
	//Obj: Test invalid very long text (length 260)
	//Input(s): "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz
	// abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz
	// abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"
	//Expected Output: CountingVowelsExceptionHandler Thrown with message "Invalid length"
	
	public void testvalidateString005()
	{
		CountingVowels testObj = new CountingVowels();
		
		try
		{
			testObj.validateString("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyza"
					+ "bcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopq"
					+ "rstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefgh"
					+ "ijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
			fail("Exception is Expected");
		}
		catch(CountingVowelsExceptionHandler e)
		{
			assertEquals("Invalid length", e.getMessage());
		}
	}
	
	/* countVowels */
	//Test #: 1
	//Obj: Test valid minimum boundary value (length 1)
	//Input(s): "H"
	//Expected Output: 0
	
	public void testcountVowels001()
	{
		CountingVowels testObj = new CountingVowels();
		
		try
		{
			int result = testObj.countVowels("H");
			assertEquals(0, result);
		}
		catch(CountingVowelsExceptionHandler e)
		{
			fail("No Exception Expected");
		}
	}
	
	//Test #: 2
	//Obj: Test valid minimum boundary value (length 1)
	//Input(s): "a"
	//Expected Output: 1
	
	public void testcountVowels002()
	{
		CountingVowels testObj = new CountingVowels();
		
		try
		{
			int result = testObj.countVowels("a");
			assertEquals(1, result);
		}
		catch(CountingVowelsExceptionHandler e)
		{
			fail("No Exception Expected");
		}
	}
	
	//Test #: 3
	//Obj: Test valid minimum boundary value (length 1)
	//Input(s): "I"
	//Expected Output: 1
	
	public void testcountVowels003()
	{
		CountingVowels testObj = new CountingVowels();
		
		try
		{
			int result = testObj.countVowels("I");
			assertEquals(1, result);
		}
		catch(CountingVowelsExceptionHandler e)
		{
			fail("No Exception Expected");
		}
	}
	
	//Test #: 4
	//Obj: Test valid maximum boundary value (length 75)
	//Input(s): "abcdefghijklmnopqrstuvwxyzAbcdEfghIjklmnOpqrstUvwxyzabcdefghijklmnOpqrstUvw"
	//Expected Output: 15
	
	public void testcountVowels004()
	{
		CountingVowels testObj = new CountingVowels();
		
		try
		{
			int result = testObj.countVowels("abcdefghijklmnopqrstuvwxyzAbcdEfghIjklmnOpqrstUvwxyzabcdefghijklmnOpqrstUvw");
			assertEquals(15, result);
		}
		catch(CountingVowelsExceptionHandler e)
		{
			fail("No Exception Expected");
		}
	}
	
	//Test #: 5
	//Obj: Test just below minimum boundary value (length 0)
	//Input(s): ""
	//Expected Output: 0
	
	public void testcountVowels005()
	{
		CountingVowels testObj = new CountingVowels();
		
		try
		{
			int result = testObj.countVowels("");
			assertEquals(0, result);
		}
		catch(CountingVowelsExceptionHandler e)
		{
			fail("No Exception Expected");
		}
	}
	
	//Test #: 6
	//Obj: Test invalid just above maximum boundary value (length 76)
	//Input(s): "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwx"
	//Expected Output: CountingVowelsExceptionHandler Thrown with message "Invalid length"
	
	public void testcountVowels006()
	{
		CountingVowels testObj = new CountingVowels();
		
		try
		{
			testObj.countVowels("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwx");
			fail("Exception is Expected");
		}
		catch(CountingVowelsExceptionHandler e)
		{
			assertEquals("Invalid length", e.getMessage());
		}
	}
	
	//Test #: 7
	//Obj: Test invalid very long text (length 260)
	//Input(s): "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz
	// abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz
	// abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"
	//Expected Output: CountingVowelsExceptionHandler Thrown with message "Invalid length"
	
	public void testcountVowels007()
	{
		CountingVowels testObj = new CountingVowels();
		
		try
		{
			testObj.countVowels("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefgh"
					+ "ijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdef"
					+ "ghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefgh"
					+ "ijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
			fail("Exception is Expected");
		}
		catch(CountingVowelsExceptionHandler e)
		{
			assertEquals("Invalid length", e.getMessage());
		}
	}
}

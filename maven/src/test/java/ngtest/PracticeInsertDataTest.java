package ngtest;

import org.testng.annotations.Test;

public class PracticeInsertDataTest {

	@Test
	public  void GetValueTest() 
	{
		String username = System.getProperty("USERNAME");
		String password = System.getProperty("PASSWORD");
		String browser = System.getProperty("BROWSER");
		
		System.out.println("USERNAME"+ "  is equal to "  + " is " + username);
		System.out.println("PASSWORD" + " is equal to " + " " + " is " + password );
		System.out.println("BROWSER" + " is equal to "  + " is " + browser);

		System.out.println("hello");
	}

}

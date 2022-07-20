package ngtest;

import org.testng.annotations.Test;

public class PracticeInsertDataTest {

	@Test
	public  void GetValueTest() 
	{
		String username = System.getProperty("USERNAME");
		String password = System.getProperty("PASSWORD");
		String browser = System.getProperty("BROWSER");
		
		String browser1 = System.getProperty("Browser");
		String url2 = System.getProperty("Url");

System.out.println("Browser" + " is " + browser1);
System.out.println("url" + " is "+ url2);
		
		System.out.println("USERNAME"+ "  is equal to "  + " is " + username);
		System.out.println("PASSWORD" + " is equal to " + " " + " is " + password );
		System.out.println("BROWSER" + " is equal to "  + " is " + browser);

		System.out.println("hello");
		System.out.println("Byee");

	}

}

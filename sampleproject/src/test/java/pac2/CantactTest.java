package pac2;

import org.testng.annotations.Test;

public class CantactTest {

	@Test
	public void createContactTest()
	{
	String URL=System.getProperty("url");
	String BROWSER=System.getProperty("browser");
	String USERNAME=System.getProperty("username");
	String PASSWORD=System.getProperty("password");
	System.out.println(URL);
	System.out.println(BROWSER);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);

	}
	

	@Test
	public void modifiedContactTest()
	{
		System.out.println("execute createContactTest");
	}

	@Test
	public void deleteContactTest()
	{
		System.out.println("execute deleteContactTest");
	}


}

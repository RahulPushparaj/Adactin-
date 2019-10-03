package StepDefinition;

import Resources.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass
{
	@Before
	public void launchbrowser() 
	{
		launchbrowser("http://adactin.com/HotelApp/index.php");
	}
	@After
	public void close() 
	{
		quit();
	}

}

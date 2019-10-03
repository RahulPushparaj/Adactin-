package StepDefinition;

import java.util.concurrent.TimeUnit;

import ObjectRepository.BookHotelLocator;
import ObjectRepository.ConfirmPageLocator;
import ObjectRepository.LoginPageLocator;
import ObjectRepository.SearchPageLocator;
import Resources.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass
{
	@Given("^User verify the url and title$")
	public void user_verify_the_url_and_title() 
	{
		if (geturl().contains("adactin"))
		{
			System.out.println("URL is True");
		}
		else
		{
			System.out.println("URL is False");
		}
		if(gettitle().contains("Hotel"))
		{
			System.out.println("Title is True");
		}
		else 
		{
			System.out.println("Title is False");
		}
	}
	@Given("^User login the Adactin page \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_login_the_Adactin_page_and(String user, String pass) 
	{
	   LoginPageLocator l = new LoginPageLocator();
	   type(l.getTextUserName(), user);
	   type(l.getTextPassWord(), pass);
	   click(l.getBtnLogin());
	}
	@Given("^User enter the details in search hotel page \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_the_details_in_search_hotel_page_and(String location, String hotel, String roomtype, String numrooms, String chechin, String checkout, String adtcount, String chdcount) 
	{
		SearchPageLocator s = new SearchPageLocator();
		dropdowntext(s.getTxtLocation(), location);
		dropdowntext(s.getTxtHotels(), hotel);
		dropdowntext(s.getTxtRoomType(), roomtype);
		dropdowntext(s.getTxtRoomNo(), numrooms);
		type(s.getTxtDateIn(), chechin);
		type(s.getTxtDateOut(), checkout);
		dropdowntext(s.getTxtAdtRoom(), adtcount);
		dropdowntext(s.getTxtChdRoom(), chdcount);
		click(s.getBtnSubmit());
		push.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		click(s.getBtnHotelSel());
		click(s.getBtnContinue());
	}
	@When("^User enter the details in booking hotel page \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_the_details_in_booking_hotel_page_and(String firstname, String lastname, String address,
			String cardno, String cardtype, String expmonth, String expyear, String ccv) throws InterruptedException 
	{
		BookHotelLocator b = new BookHotelLocator();
		type(b.getTxtFirstName(), firstname);
		type(b.getTxtLastName(), lastname);
		type(b.getTxtAddress(), address);
		type(b.getTxtCreditCard(), cardno);
		dropdowntext(b.getTxtCardType(), cardtype);
		dropdowntext(b.getTxtCardExpMonth(), expmonth);
		dropdowntext(b.getTxtCardExpYear(), expyear);
		type(b.getTxtCreditCCV(), ccv);
		click(b.getBtnBookNow());
		Thread.sleep(5000);
		ConfirmPageLocator c = new ConfirmPageLocator();
	    String orderid = c.getTxtOrderNo().getAttribute("value");
	    System.out.println("Order ID="+orderid);
	    click(c.getBtnMyIter());
	    push.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    click(c.getBtnCheckAll());
		click(c.getBtnCancel());
		alert("Confirm", "accept");
		click(c.getBtnLogout());
	}
}

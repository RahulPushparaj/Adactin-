package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.BaseClass;

public class LoginPageLocator extends BaseClass
{
	public LoginPageLocator() 
	{
		PageFactory.initElements(push, this);
	}
	
	@FindBy(id="username")
	private WebElement textUserName;
	@FindBy(id = "password")
	private WebElement textPassWord;
	@FindBy(id = "login")
	private WebElement btnLogin;
	
	public WebElement getTextUserName()
	{
		return textUserName;
	}
	public WebElement getTextPassWord()
	{
		return textPassWord;
	}
	public WebElement getBtnLogin() 
	{
		return btnLogin;
	}
	
	
}

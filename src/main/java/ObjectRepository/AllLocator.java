package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.BaseClass;

public class AllLocator extends BaseClass
{
	public  AllLocator()
	{
		PageFactory.initElements(push, this);
	}
	
	@FindBy(id="username")
	private WebElement textUserName;
	@FindBy(id = "password")
	private WebElement txtPassWord;
	@FindBy(id = "login")
	private WebElement btnLogin;
	@FindBy(id = "location")
	private WebElement txtLocation;
	@FindBy(id = "hotels")
	private WebElement txtHotels;
	@FindBy(id = "room_type")
	private WebElement txtRoomType;
	@FindBy(id = "room_nos")
	private WebElement txtRoomNo;
	@FindBy(id = "datepick_in")
	private WebElement txtDateIn;
	@FindBy(id = "datepick_out")
	private WebElement txtDateOut;
	@FindBy(id = "adult_room")
	private WebElement txtAdtRoom;
	@FindBy(id = "child_room")
	private WebElement txtChdRoom;
	@FindBy(id = "Submit")
	private WebElement btnSubmit;
	@FindBy(id = "radiobutton_0")
	private WebElement btnHotelSel;
	@FindBy(id = "continue")
	private WebElement btnContinue;
	@FindBy(id = "first_name")
	private WebElement txtFirstName;
	@FindBy(id = "last_name")
	private WebElement txtLastName;
	@FindBy(id = "address")
	private WebElement txtAddress;
	@FindBy(id = "cc_num")
	private WebElement txtCreditCard;
	@FindBy(id = "cc_type")
	private WebElement txtCardType;
	@FindBy(id = "cc_exp_month")
	private WebElement txtCardExpMonth;
	@FindBy(id = "cc_exp_year")
	private WebElement txtCardExpYear;
	@FindBy(id = "cc_cvv")
	private WebElement txtCreditCCV;
	@FindBy(id = "book_now")
	private WebElement btnBookNow;
	@FindBy(id = "order_no")
	private WebElement txtOrderNo;
	@FindBy(id = "my_itinerary")
	private WebElement btnMyIter;
	@FindBy(id = "check_all")
	private WebElement btnCheckAll;
	@FindBy(name = "cancelall")
	private WebElement btnCancel;
	@FindBy(name = "logout")
	private WebElement btnLogout;
	
	public WebElement getTextUserName() {
		return textUserName;
	}
	public WebElement getTxtPassWord() {
		return txtPassWord;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	public WebElement getTxtLocation() {
		return txtLocation;
	}
	public WebElement getTxtHotels() {
		return txtHotels;
	}
	public WebElement getTxtRoomType() {
		return txtRoomType;
	}
	public WebElement getTxtRoomNo() {
		return txtRoomNo;
	}
	public WebElement getTxtDateIn() {
		return txtDateIn;
	}
	public WebElement getTxtDateOut() {
		return txtDateOut;
	}
	public WebElement getTxtAdtRoom() {
		return txtAdtRoom;
	}
	public WebElement getTxtChdRoom() {
		return txtChdRoom;
	}
	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	public WebElement getBtnHotelSel() {
		return btnHotelSel;
	}
	public WebElement getBtnContinue() {
		return btnContinue;
	}
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}
	public WebElement getTxtLastName() {
		return txtLastName;
	}
	public WebElement getTxtAddress() {
		return txtAddress;
	}
	public WebElement getTxtCreditCard() {
		return txtCreditCard;
	}
	public WebElement getTxtCardType() {
		return txtCardType;
	}
	public WebElement getTxtCardExpMonth() {
		return txtCardExpMonth;
	}
	public WebElement getTxtCardExpYear() {
		return txtCardExpYear;
	}
	public WebElement getTxtCreditCCV() {
		return txtCreditCCV;
	}
	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	public WebElement getTxtOrderNo() {
		return txtOrderNo;
	}
	public WebElement getBtnMyIter() {
		return btnMyIter;
	}
	public WebElement getBtnCheckAll() {
		return btnCheckAll;
	}
	public WebElement getBtnCancel() {
		return btnCancel;
	}
	public WebElement getBtnLogout() {
		return btnLogout;
	}
	

}

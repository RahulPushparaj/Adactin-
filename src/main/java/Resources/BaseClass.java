package Resources;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	static public WebDriver push;
	static public Select sel;
	static public Actions act;
	static public Alert alert;

	public static void launchbrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "D:\\PUSHPARAJ123\\Adactin_Project\\Driver\\chromedriver.exe");
		push = new ChromeDriver();
		push.get(url);
	}

	public static void quit() {
		push.quit();
	}

	public static void type(WebElement e, String s) {
		e.sendKeys(s);
	}

	public static void click(WebElement e) {
		e.click();
	}

	public static String geturl() {
		String url = push.getCurrentUrl();
		return url;
	}

	public static String gettitle() {
		String title = push.getTitle();
		return title;
	}

	public static void dropdownvalue(WebElement e, String value) {
		sel = new Select(e);
		sel.selectByValue(value);
	}

	public static void dropdowntext(WebElement e, String text) {
		sel = new Select(e);
		sel.selectByVisibleText(text);
	}

	public static void dropdownindex(WebElement e, int index) {
		sel = new Select(e);
		sel.selectByIndex(index);
	}

	public static void movetoelemeent(WebElement e) {
		act = new Actions(push);
		act.moveToElement(e).perform();
	}

	public static void doubleclick(WebElement e) {
		act = new Actions(push);
		act.doubleClick(e).perform();
	}

	public static void contextclick(WebElement e) {
		act = new Actions(push);
		act.contextClick(e).perform();
	}

	public static void draganddrop(WebElement src, WebElement dec) {
		act = new Actions(push);
		act.dragAndDrop(src, dec);
	}

	public static void keydownkeyup(WebElement e, String s) {
		act = new Actions(push);
		act.keyDown(e, Keys.SHIFT).sendKeys(s).keyUp(e, Keys.SHIFT).perform();
	}

	public static void screenshot(String img) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) push;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File dec = new File("D:\\PUSHPARAJ" + img);
		FileUtils.copyFile(src, dec);
	}

	public static void windowshandling(WebDriver d) {
		String parwind = d.getWindowHandle();
		Set<String> allwind = d.getWindowHandles();
		for (String chiwind : allwind) {
			if (chiwind.equals(parwind)) {
				push.switchTo().window(chiwind);
			}
		}
	}

	public static void mulwindowshandling(WebDriver d, int win) {
		Set<String> allwind = d.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>();
		list.addAll(allwind);
		push.switchTo().window(list.get(win));
	}

	public static void alert(String alerttype, String action) {
		alert = push.switchTo().alert();
		if (alerttype.equals("Simple")) {
			if (action.equals("accept")) {
				alert.accept();
			}
		} else if (alerttype.equals("Confirm")) {
			if (action.equals("accept")) {
				alert.accept();
			} else if (action.equals("dismiss")) {
				alert.dismiss();
			}
		} else if (alerttype.equals("Prompt")) {
			if (action.equals("accept")) {
				alert.sendKeys("Yes");
				alert.accept();
			} else if (action.equals("dismiss")) {
				alert.sendKeys("No");
				alert.accept();
			}
		}
	}

}

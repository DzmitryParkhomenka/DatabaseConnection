package ftm.mailclienttest.emailtestpage;

import org.openqa.selenium.By;
import ftm.mailclienttest.abstractpage.AbstractPage;

public class LoggedIconPopUp extends AbstractPage{
	private static final By EXIT_BUTTON_LOCTOR = By.xpath("//*[@id='gb_71']");
	private static final By EMAIL_LOGGED_ICON_INSIDE_EMAIL_LOCATOR = By.xpath("//*[@id='gb']/div[2]/div[3]/div/div[2]/div/a");
	
	public LoggedIconPopUp() {
		super();
	}
	
	public void clickIconInsideEmail() {
		waitForElementVisible(EMAIL_LOGGED_ICON_INSIDE_EMAIL_LOCATOR);
		driver.findElement(EMAIL_LOGGED_ICON_INSIDE_EMAIL_LOCATOR).click();
	}
	
	public void clickExitButton() {
		waitForElementVisible(EXIT_BUTTON_LOCTOR);
		driver.findElement(EXIT_BUTTON_LOCTOR).click();
	}
}

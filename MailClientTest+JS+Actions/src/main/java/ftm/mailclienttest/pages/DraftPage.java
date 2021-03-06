package ftm.mailclienttest.pages;

import org.openqa.selenium.By;

import ftm.mailclienttest.screenshoter.Screenshoter;

public class DraftPage extends AbstractPage{
	private static final String DRAFT_PAGE_URL = "https://mail.google.com/mail/u/0/#drafts";
	private static final By TOPIC_DRAFT_NOTIFICATION_LOCATOR = By.xpath("//span[@class='bog']");
	private static final By REFRESH_DRAFT_BUTTON_LOCATOR = By.xpath("//div[@data-tooltip='Обновить']");
	private static final By SEND_EMAIL_BUTTON_LOCATOR = By.xpath("//div[@class='J-J5-Ji btA']");
	
	public DraftPage() {
		super();
	}
	
	public void openDraftURL() {
		driver.get(DRAFT_PAGE_URL);
	}
	
	public String getTextFromTopic() {
		waitForElementVisible(TOPIC_DRAFT_NOTIFICATION_LOCATOR);
		return driver.findElement(TOPIC_DRAFT_NOTIFICATION_LOCATOR).getText();
	}
	
	public EmailPopUp clickTopicLink() {
		waitForElementVisible(TOPIC_DRAFT_NOTIFICATION_LOCATOR);
		highlightElement(TOPIC_DRAFT_NOTIFICATION_LOCATOR);		
		Screenshoter.takeScreenshot();
		driver.findElement(TOPIC_DRAFT_NOTIFICATION_LOCATOR).click();
		return new EmailPopUp();
	}
	
	public void refreshDraftPage() {
		driver.navigate().refresh();
		if (checkAlert() == true) {
			driver.switchTo().alert().accept();
		}
	}
	
	public boolean checkAlert() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void clickRefreshButton() {
		waitForElementVisible(REFRESH_DRAFT_BUTTON_LOCATOR);
		highlightElement(REFRESH_DRAFT_BUTTON_LOCATOR);
		Screenshoter.takeScreenshot();
		unHighlightElement(REFRESH_DRAFT_BUTTON_LOCATOR);
		driver.findElement(REFRESH_DRAFT_BUTTON_LOCATOR).click();
		
	}
	
	public void clickSendEmailButton() {
		waitForElementVisible(SEND_EMAIL_BUTTON_LOCATOR);
		highlightElement(SEND_EMAIL_BUTTON_LOCATOR);
		Screenshoter.takeScreenshot();
		unHighlightElement(SEND_EMAIL_BUTTON_LOCATOR);
		driver.findElement(SEND_EMAIL_BUTTON_LOCATOR).click();
	}
}

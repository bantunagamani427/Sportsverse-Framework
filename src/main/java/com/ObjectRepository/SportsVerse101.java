package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Generic.WebDriverUtil;

public class SportsVerse101 {

	WebDriver driver;
	WebDriverUtil driverUtil=new WebDriverUtil(driver);


	public SportsVerse101(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath= "//button[@class='sport-btn ']")
	private WebElement downLoadApp;
	public WebElement getdownLoadApp() {
		return downLoadApp;
	}

	@FindBy(xpath = "//a[normalize-space()='Sprotsverse101']")
	private WebElement SportsVerse101DD;
	public WebElement getSportsVerse101DD() {
		return SportsVerse101DD;
	}

	@FindBy(xpath= "//body//div[@id='root']//a[@href='#basic']//li[1]")
	private WebElement basicsFAQ;
	public WebElement getbasicsFAQ() {
		return basicsFAQ;
	}

	@FindBy(xpath = "//div[@class=\"accordion accordion-flush\"]")
	private WebElement basicFAQContainer;
	public List<WebElement> getbasicFAQContainer() {
		return basicFAQContainer.findElements(By.tagName("h2"));
	}


	@FindBy(xpath= "//body//div[@id='root']//a[@href='#videos']//li[1]")
	private WebElement videosLink;
	public WebElement getvideosLink() {
		return videosLink;
	}

	//	@FindBy(id="videos")
	//	private WebElement videosContainer;
	//	public WebElement getvideosContainer() {
	//		return videosContainer.findElements(By.);
	//	}

	@FindBy(xpath ="//h1[@class='all-depends-heading pt-5 pb-5']")
	private WebElement ItAllDependsOnTxt;
	public WebElement getItAllDependsOnTxt() {
		return ItAllDependsOnTxt;
	}
	/*
	@FindBy(xpath= "//div[@class=\"accordion accordion-flush\"]")
	private WebElement AllDependsSubTxtContainer;

	public void AllDependsOnTxt(WebDriver driver) {
		List<WebElement> AlldependsBoxes = AllDependsSubTxtContainer.findElements(By.tagName("a"));
		for(WebElement AlldependsBox:AlldependsBoxes) {
			driverUtil.moveToelement(AlldependsBox);
			System.out.println("All depends Sub Text: "+AlldependsBox.getText());
		}
	}
	 */
	@FindBy(xpath = "//div[@class=\"accordion accordion-flush\"]")
	private WebElement 	AllDependsSubTxtContainer1;
	public List<WebElement> getAllDependsSubTxtContainer1() {
		return AllDependsSubTxtContainer1.findElements(By.tagName("a"));
	}


	@FindBy(xpath = "//div[@class=\"accordion accordion-flush\"]")
	private WebElement AlldependsImagescontainer;
	public List<WebElement> getAlldependsImagescontainer(){
		return AlldependsImagescontainer.findElements(By.tagName("img"));
	}



	/*
	public void AllDependsImagesDispalyed(WebDriver driver) {
		List<WebElement> AllDependsImages = AllDependsSubTxtContainer1.findElements(By.tagName("img"));
		for(WebElement AllDependsImage:AllDependsImages) {
			driverUtil.moveToelement(AllDependsImage);
			System.out.println("All Depends Images are Dispaleyd: "+AllDependsImage.isDisplayed());
		}
	}
	 */

	@FindBy(xpath="//h2[contains(@class,'c-btn')]")
	private WebElement contactSupportbtn;
	public WebElement getcontactSupportbtn(){
		return contactSupportbtn;
	}

	@FindBy(xpath="//h2[@class='btn-h']")
	private WebElement ImageDownloadApp;
	public WebElement getImageDownloadApp(){
		return ImageDownloadApp;
	}


	/*
	 *
	 @FindBy(xpath="//div[@class=\"d-flex icons-section pt-4\"]")
	private WebElement OurCommunitysocialMediaIcons;
	public void OurCommunitysocialMediaIcons(WebDriver driver) throws InterruptedException {
		List<WebElement> socialMediaIcons = OurCommunitysocialMediaIcons.findElements(By.tagName("a"));
		WebDriverUtil driverutil=new WebDriverUtil(driver);
		Actions actions=new Actions(driver);
		for(WebElement socialMediaIcon:socialMediaIcons) {
			actions.moveToElement(socialMediaIcon).click().perform();
			Thread.sleep(3000);
			driverutil.switchToChildWindowAndClose(driver);
		}
	}

	 */
























	/*
	 * // Locate the carousel element
WebElement carousel = driver.findElement(By.id("carousel"));

// Verify that the carousel is visible and contains expected number of items
assertTrue(carousel.isDisplayed());
List<WebElement> items = carousel.findElements(By.tagName("div"));
assertEquals(5, items.size());

// Click on next button and verify expected item is displayed
carousel.findElement(By.className("next")).click();
assertEquals("Item 2", items.get(0).getText());

// Click on previous button and verify expected item is displayed
carousel.findElement(By.className("prev")).click();
assertEquals("Item 1", items.get(0).getText());

// Loop through all items and verify carousel loops back to beginning
for (int i = 0; i < items.size(); i++) {
    carousel.findElement(By.className("next")).click();
    assertEquals("Item " + (i+2), items.get(0).getText());
}
carousel.findElement(By.className("next")).click();
assertEquals("Item 1", items.get(0).getText());

// Test carousel with various screen sizes
Dimension size1 = new Dimension(800, 600);
driver.manage().window().setSize(size1);
// repeat steps above to test carousel functionality
	 * 
	 * 
	 * using for each loop provide the code of above
ChatGPT
Sure, here's an example of how you could use a foreach loop in Java to iterate through the elements in a carousel and perform some action on each element:

scss
Copy code
List<WebElement> carouselItems = driver.findElements(By.xpath("//div[@class='carousel-item']"));

for (WebElement item : carouselItems) {
    // Perform some action on each item
    item.click();
    // Or get some data from each item
    String itemName = item.getText();
    System.out.println("Item name: " + itemName);
}
	 * 
	 * 
	 * 
	 * 
	 * 

	 */

}

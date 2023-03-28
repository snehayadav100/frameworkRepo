package Base_Or;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BaseOr {

//	protected WebUtil Web;
//
//	public BaseOr (WebUtil web) {
//    this.Web=web;
//	PageFactory.initElements(WebUtil.GetDriver(), this );
//	}
	@FindBy(xpath = "//a[text()='Help']")
	protected WebElement help;
	
	@FindBy(xpath = "//table[@class='lvt small']/parent::div/preceding-sibling::table//input[@value='Delete']")
	protected WebElement deleteButton;
	
	@FindBy(xpath = "//input[@value='Find']")
	protected WebElement find;
	
    @FindBy(xpath = "//a[text()='vtiger News']")	
	protected WebElement vtigerNew;
    
    @FindBy(xpath = "//a[text()='Gmail Bookmarklet']")
	protected WebElement gmailbookmarklet;
    
    
    @FindBy(xpath = "//a[text()='Feedback']")
    protected WebElement feedback;
    
    
    @FindBy(xpath = "//a[text()='My Preferences']")
    protected WebElement myPreferences;
    
    @FindBy(xpath = "//a[text()='Sign Out']")
    protected WebElement singout;
    
    @FindBy(xpath = "//a[text()='About Us']")
    protected WebElement aboutus;
    
    
    
    
    
    
    
    
    
    
    
	
	
	
}

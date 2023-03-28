package Base_Or;

import org.openqa.selenium.support.PageFactory;

import com.evs.vtiger.generic_layer.WebUtil;

public class BasePage extends BaseOr {

	protected WebUtil Web;

	public BasePage(WebUtil web) {
//		super(web);
		this.Web=web;
		PageFactory.initElements(Web.GetDriver(), this );

	}
	
	public void Forfind() {
		Web.clickbutton(find);
	}
	
	public void ForHelp() {
		Web.clickbutton(help);
	}
	public void ForvtigerNew() {
		Web.clickbutton(vtigerNew);
	}
	public void Forgmail() {
	    Web.clickbutton(gmailbookmarklet);	
		
	}
	public void Forfeedback() {
		Web.clickbutton(feedback);
	}
	public void FormyPrefrence() {
		Web.clickbutton(aboutus);
	}	
	public void ForSingout() {
		Web.clickbutton(singout);
		
	}
	
	public  void delete() {
	Web.clickbutton(deleteButton);
	Web.ForAlertAccept("delete");
	
	
	}
	public  void cancleDelete() {
	Web.clickbutton(deleteButton);
	Web.ForAlertDismiss("AfterDeleteclick");
	}
	}



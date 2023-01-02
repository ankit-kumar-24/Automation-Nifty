package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Niftyloginpage {
	public WebDriver ldriver;

	public Niftyloginpage(WebDriver driver) {
		ldriver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "login-email")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(id = "login-password")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(id ="login-submit")
	@CacheLookup
	WebElement loginbtn;
	
	By googlelink = By.xpath("//a[@class='btn btn-link btn-text-caution']");

	By clickemail = By.xpath("(//input[@id='identifierId'])[1]");
	By emailsend = By.xpath("(//input[@id='identifierId'])[1]");
	By clicknext = By.xpath("//span[contains(text(),'Next')]");
	By passwordsend = By.xpath("(//input[@name='password'])[1]");
	By ssolink = By.xpath("//button[@class='btn btn-link']");
	By ssoemail = By.xpath("(//input[@id='login-email'])[1]");
	By ssoclick = By.xpath("(//button[normalize-space()='Sign in with SSO'])[1]");

	// Project creation
	By projectadd = By.xpath("//span[@class='btn visible-on-hover nav-btn-add'][1]");
	By projectname = By.cssSelector("input[placeholder='Enter project name...']");
	By projectcreatebutton = By.cssSelector("div[class='section-step step-1 active'] button[class='btn btn-success ']");
	// Project delete
	By projectmenu = By.xpath("//body/div[@id='root']/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]");
	By deleteoption = By.xpath("//span[normalize-space()='Delete Project']");
	By inputdelete = By.cssSelector("div[class='modal-body'] input[type='text']");
	By deletebutton = By.xpath("//button[@class='btn btn-caution btn-has-loading']");
	// private project
	By privateoption = By.xpath("(//span[@class='radio'])[1]");
	// Save template
	By savetemplate = By.xpath("(//span[contains(text(),'Save as template…')])[1]");
	By templatename = By.xpath("(//input[@placeholder='E.g., Product Management'])[1]");
    By templatedescription = By.xpath("(//textarea[@placeholder='Add a description...'])[1]");
    By templatebutton = By.xpath("(//button[normalize-space()='Create template'])[1]");
    By archivedproject = By.xpath("(//span[normalize-space()='Archive Project'])[1]");
    By inputarchieve = By.cssSelector("div[class='modal-body'] input[type='text']");
    By archivebutton = By.xpath("(//input[@class='field-input'])[4]");
    // Dublicate project
    By dublicateoption = By.xpath("//span[normalize-space()='Duplicate project…']");
    By dublicateprojectbutton = By.xpath("(//button[@class='btn btn-success '])[3]");
    
    // Project Edit
    By projectsetting = By.xpath("//span[normalize-space()='Project Settings']");
    By projectshortname = By.xpath("(//input[@id='edit-project-name'])[1]");
    By editprojectname = By.xpath("(//input[@id='edit-project-name'])[2]");
    By changecolour = By.xpath("(//span[normalize-space()='Change color'])[1]");
    By choosecolour = By.xpath("(//span[@class='color-block-click-overlay'])[7]");
    By savechanges = By.xpath("(//button[normalize-space()='Save changes'])[1]");
    
    
    
    
    
	// Action methods
	public void setusername(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);
	}

	public void setpassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}

	public void clicklogin() {
		loginbtn.click();
	}

	public void linkgoogle() {
		ldriver.findElement(googlelink).click();

	}
	public void Clickemail() {
		ldriver.findElement(clickemail).click();
	}
	public void Emailsend() {
		ldriver.findElement(emailsend).sendKeys("ankit.k@gortnm.in");
	}
	public void Clicknext() {
		ldriver.findElement(clicknext).click();
	}
	public void Passwordsend() {
		ldriver.findElement(passwordsend).sendKeys("Ankitkumar2417");
	}

	// SSO Scenario
	//	 public void Ssolink() {
	//		 ldriver.findElement(ssolink).click();
	//	 }
	//	 public void Ssoemail() {
	//		 ldriver.findElement(ssoemail).sendKeys("ankit.k@gortnm.in");
	//	 }
	//	 public void Ssoclick() {
	//		 ldriver.findElement(ssoclick).click();
	//	 }


	// Project creation	 
	public void Projectadd() throws InterruptedException {
		ldriver.findElement(projectadd).click();
	}

	public void Projectname() {
		ldriver.findElement(projectname).sendKeys("Project testing");
	}

	public void Projectcreationbutton() {
		ldriver.findElement(projectcreatebutton).click();
		
	}
	public void Privateoption() {
		ldriver.findElement(privateoption).click();
	}
	
	public void Projectmenu() {
		Actions actions = new Actions(ldriver);
		WebElement menuOption = ldriver.findElement(By.xpath("//span[contains(text(),'Project testing')]")); // We have to delete all older projects
		actions.moveToElement(menuOption).build().perform();
		ldriver.findElement(projectmenu).click();
	}
	
	public void Deleteoption() {
		ldriver.findElement(deleteoption).click();
	}
	
	public void Inputdelete() {
		ldriver.findElement(inputdelete).click();
		ldriver.findElement(inputdelete).sendKeys("DELETE");
	}
	
	public void Deletebutton() {
		ldriver.findElement(deletebutton).click();
	}
	
	public void Projecttitle() {
		String title = ldriver.getTitle();
		String expectedtitle = "Project testing Tasks | Nifty";
	  	  if(title.equals(expectedtitle)) {
	  		System.out.println("This title is " +title+ " Valid");
	  	  }
	  	  else {
	  	  System.out.println("Wrong title");
	  	  }	  	  
	}
	
	public void Deletetitle() {
		String Deletetitle = ldriver.getTitle();
		String expectedtitle = "General Portfolio | Nifty";
	  	  if(Deletetitle.equals(expectedtitle)) {
	  		System.out.println("This title is " +Deletetitle+ " Valid");
	  	  }
	  	  else {
	  	  System.out.println("Wrong title");
	  	  }	
	}
	 public void Templatetitle() {
		 String templatetitlee = ldriver.getTitle();
		 String expectedtitle = "Project testing Tasks | Nifty";
	  	  if(templatetitlee.equals(expectedtitle)) {
	  		System.out.println("This title is " +templatetitlee+ " Valid");
	  	  }
	  	  else {
	  	  System.out.println("Wrong title");
	  	  }
	 }
	 
	 public void Archivetitle() {
		 String archievetitlee = ldriver.getTitle();
		 System.out.println(archievetitlee);
	 }
	public void Savetemplate() {
		ldriver.findElement(savetemplate).click();
	}
	public void Templatdetails() {
		ldriver.findElement(templatename).click();
		ldriver.findElement(templatename).sendKeys("Template Testing");
		ldriver.findElement(templatedescription).click();
		ldriver.findElement(templatedescription).sendKeys("Template description");
		ldriver.findElement(templatebutton).click();
	}
	
	public void Archievedproject() {
		ldriver.findElement(archivedproject).click();
	}
	public void Inputarchive() {
		ldriver.findElement(inputarchieve).click();
		ldriver.findElement(inputarchieve).sendKeys("ARCHIVE");
	}
	public void Archievebutton() {
		ldriver.findElement(archivebutton).click();
	}
	public void Dublicateoption() {
		ldriver.findElement(dublicateoption).click();
	}
	public void Dublicateprojectbutton() {
		ldriver.findElement(dublicateprojectbutton);
	}
	public void Projectsetting() {
		ldriver.findElement(projectsetting).click();
	}
	public void Projectshortname() throws InterruptedException {
		ldriver.findElement(projectshortname).click();
		ldriver.findElement(projectshortname).sendKeys("T");
	}
	public void Getshortname() {
		String shorttitle = ldriver.getTitle();
		String expectedtitle = "Projects: Project testing | Nifty";
	  	  if(shorttitle.equals(expectedtitle)) {
	  		System.out.println("This title is " +shorttitle+ " Valid");
	  	  }
	  	  else {
	  	  System.out.println("Wrong title");
	  	  }
	 }
		
	
	public void Editprojectname() {
		ldriver.findElement(editprojectname).click();
		ldriver.findElement(editprojectname).sendKeys(" New");
	}
	public void Getprojectname() {
		String projectnametitle = ldriver.getTitle();
		String expectedtitle = "Projects: Project testing | Nifty";
	  	  if(projectnametitle.equals(expectedtitle)) {
	  		System.out.println("This title is " +projectnametitle+ " Valid");
	  	  }
	  	  else {
	  	  System.out.println("Wrong title");
	  	  }
	}
	public void Editcolour() {
		ldriver.findElement(changecolour).click();
		ldriver.findElement(choosecolour).click();
	}
	
	public void Savechanges() {
		ldriver.findElement(savechanges).click();
	}
}

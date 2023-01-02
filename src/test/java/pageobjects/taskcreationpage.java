package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class taskcreationpage {
	public WebDriver ldriver;

	public taskcreationpage(WebDriver driver) {
		ldriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	By addtask = By.xpath("//button[contains(text(),'Add a Task')]");
	By taskname = By.xpath("//div[@class='multi-line-input edit-panel-input empty']");
	By createtask = By.xpath("//button[@class='btn btn-small btn-success']");
	
	// Subtask creation
	By addsubtask = By.xpath("//div[@class='task-overlay']");
	By subtaskname = By.xpath("(//div[@placeholder='Add a new subtask...'])[1]");
	
	// Subtask delete
	By hoversubtask = By.xpath("//div[@class='subtask-item can-edit']//div[@class='item-click-overlay']");
	By moreoption = By.xpath("//div[@class='item-main']//div[3]");
	By subtaskdelete = By.xpath("(//div[contains(text(),'Delete')])[1]");
	By subtaskdelete1 = By.xpath("(//button[normalize-space()='Delete'])[1]");
	
	// Task delete
	By taskoption = By.xpath("//span[@class='content-panel-simple-action-inner']");
	By taskdelete = By.xpath("//div[contains(text(),'Delete')]");
	By taskdelete1 = By.xpath("//button[normalize-space()='Delete']");
	
	// Task functionality
	By clickassignes = By.xpath("(//span[@class='action-text'][normalize-space()='Add'])[1]");
	By addassignes = By.xpath("(//div[@class='user-entry-body-main'])[1]");
	By clicktask = By.xpath("(//div[@class='task-overlay'])[1]");
	By clicktags = By.xpath("//div[@class='labels-list inverted']//span[@class='action-text'][normalize-space()='Add']");
	By addtags = By.xpath("//body[1]/div[7]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/span[3]");
	By clickdate = By.xpath("(//span[@class='placeholder action-text'])[1]");
	By clickarrow = By.xpath("(//button[@class='btn btn-secondary btn-xsmall btn-icon btn-square'])[2]");
	By adddate = By.xpath("(//div[@aria-label='Choose Saturday, January 28th, 2023'])[1]");
	By selectdatebutton = By.xpath("//button[@class='btn btn-small btn-success']");
	By addstorypoint = By.cssSelector("input[placeholder='Set']");
	By adddescription = By.xpath("(//div[@placeholder='Add task description'])[1]");
	By addcomments = By.xpath("(//div[@placeholder='Post a comment…'])[1]");
	
	
	
	
	
	
	//Actions
	public void Addtask() {
		ldriver.findElement(addtask).click();
	}
	public void Taskname(){
		ldriver.findElement(taskname).sendKeys("Task 1");
	}
	public void Createtask() {
		ldriver.findElement(createtask).click();
	}
	public void tasktitle() {
		String tasktitlee = ldriver.getTitle();
		String expectedtitle = "Project testing Tasks | Nifty";
	  	  if(tasktitlee.equals(expectedtitle)) {
	  		System.out.println("This title is " +tasktitlee+ " Valid");
	  	  }
	  	  else {
	  	  System.out.println("Wrong title");
	  	  }	
	}
	
    public void Addsubtask() {
    	ldriver.findElement(addsubtask).click();
    }
	public void Subtaskname() throws InterruptedException {
		ldriver.findElement(subtaskname).sendKeys("Subtask 1");
		Thread.sleep(2000);
		ldriver.findElement(subtaskname).sendKeys(Keys.ENTER);
	}
	public void subtasktitle() {
		String subtitle = ldriver.getTitle();
		String expectedtitle = "Project testing Tasks | Nifty";
	  	  if(subtitle.equals(expectedtitle)) {
	  		System.out.println("This title is " +subtitle+ " Valid");
	  	  }
	  	  else {
	  	  System.out.println("Wrong title");
	  	  }	
	}
	
	public void subtaskdeletetitle() {
		String subdeletetitlee = ldriver.getTitle();
		String expectedtitle = "Project testing Tasks | Nifty";
	  	  if(subdeletetitlee.equals(expectedtitle)) {
	  		System.out.println("This title is " +subdeletetitlee+ " Valid");
	  	  }
	  	  else {
	  	  System.out.println("Wrong title");
	  	  }	
	}
	
	public void taskdeletetitle() {
		String taskdeletetitlee = ldriver.getTitle();
		String expectedtitle = "Project testing Tasks | Nifty";
	  	  if(taskdeletetitlee.equals(expectedtitle)) {
	  		System.out.println("This title is " +taskdeletetitlee+ " Valid");
	  	  }
	  	  else {
	  	  System.out.println("Wrong title");
	  	  }	
	}
	
	public void Moreoption() {
		Actions actions = new Actions(ldriver);
		  WebElement menuOption = ldriver.findElement(hoversubtask);
		  actions.moveToElement(menuOption).build().perform();
		  ldriver.findElement(moreoption).click();
	}
	
	public void Subtaskdelete() throws InterruptedException {
		ldriver.findElement(subtaskdelete).click();
		Thread.sleep(2000);
		ldriver.findElement(subtaskdelete1).click();
	}
	
	public void Taskoption() {
		ldriver.findElement(taskoption).click();
	}
	
	public void Taskdelete() throws InterruptedException {
		ldriver.findElement(taskdelete).click();
		Thread.sleep(2000);
		ldriver.findElement(taskdelete1).click();
	}
	public void Assignedassignes() {
		ldriver.findElement(clickassignes).click();
		ldriver.findElement(addassignes).click();
	}
	public void Clicktask() {
		ldriver.findElement(clicktask).click();
	}
	
	public void getassignestitle() {
		String assigntitle = ldriver.getTitle();
		String expectedtitle = "Project testing Tasks | Nifty";
	  	  if(assigntitle.equals(expectedtitle)) {
	  		System.out.println("This title is " +assigntitle+ " Valid");
	  	  }
	  	  else {
	  	  System.out.println("Wrong title");
	  	  }	
	}
	
	public void Addtags() {
		ldriver.findElement(clicktags).click();
		ldriver.findElement(addtags).click();
	}
	
	public void gettagtitle() {
		String tagtitle = ldriver.getTitle();
		String expectedtitle = "Project testing Tasks | Nifty";
	  	  if(tagtitle.equals(expectedtitle)) {
	  		System.out.println("This title is " +tagtitle+ " Valid");
	  	  }
	  	  else {
	  	  System.out.println("Wrong title");
	  	  }
	}
	
	public void Adddate() throws InterruptedException {
		ldriver.findElement(clickdate).click();
		Thread.sleep(1000);
		ldriver.findElement(clickarrow).click();
		Thread.sleep(1000);
		ldriver.findElement(adddate).click();
		Thread.sleep(2000);
		ldriver.findElement(selectdatebutton);
		Thread.sleep(2000);
	}
	
	public void getdatetitle() {
		String datetitle = ldriver.getTitle();
		String expectedtitle = "Project testing Tasks | Nifty";
	  	  if(datetitle.equals(expectedtitle)) {
	  		System.out.println("This title is " +datetitle+ " Valid");
	  	  }
	  	  else {
	  	  System.out.println("Wrong title");
	  	  }
	}
	
	public void Addstorypoint() {
		//ldriver.findElement(addstorypoint).click();
		ldriver.findElement(addstorypoint).sendKeys("10");
		ldriver.findElement(addstorypoint).sendKeys(Keys.ENTER);
	}
	public void getstorytitle() {
		String storytitle = ldriver.getTitle();
		String expectedtitle = "Project testing Tasks | Nifty";
	  	  if(storytitle.equals(expectedtitle)) {
	  		System.out.println("This title is " +storytitle+ " Valid");
	  	  }
	  	  else {
	  	  System.out.println("Wrong title");
	  	  }
	}
	public void Adddescription() {
		ldriver.findElement(adddescription).click();
		ldriver.findElement(adddescription).sendKeys("Adding description for testing");
	}
	public void getdesctitle() {
		String desctitle = ldriver.getTitle();
		String expectedtitle = "Project testing Tasks | Nifty";
	  	  if(desctitle.equals(expectedtitle)) {
	  		System.out.println("This title is " +desctitle+ " Valid");
	  	  }
	  	  else {
	  	  System.out.println("Wrong title");
	  	  }
	}	
	public void Addcomments() {
        ldriver.findElement(addcomments).click();
        ldriver.findElement(addcomments).sendKeys("Adding comments for testing");
        ldriver.findElement(addcomments).sendKeys(Keys.ENTER);
	}
	public void getcommenttitle() {
		String commenttitle = ldriver.getTitle();
		String expectedtitle = "Project testing Tasks | Nifty";
	  	  if(commenttitle.equals(expectedtitle)) {
	  		System.out.println("This title is " +commenttitle+ " Valid");
	  	  }
	  	  else {
	  	  System.out.println("Wrong title");
	  	  }
	}	
}

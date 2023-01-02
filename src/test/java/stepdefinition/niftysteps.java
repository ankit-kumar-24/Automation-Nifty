package stepdefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Niftyloginpage;
import pageobjects.taskcreationpage;


public class niftysteps extends baseclass{

//	public WebDriver driver;
//	public Niftyloginpage lp;
//	public taskcreationpage tp;


	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		driver = new ChromeDriver();
		lp = new Niftyloginpage(driver);

	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
		lp.setusername(email);
		lp.setpassword(password);
	}

	@When("Click on Login")
	public void click_on_login() throws InterruptedException {
		lp.clicklogin();
		Thread.sleep(20000);
	}

	@Then("close browser")
	public void close_browser() {
		driver.quit();
	}


	// Successful login Using Google 

	@When("Click on google link")
	public void click_on_google_link() {
		lp.linkgoogle();
	}

	@When("User enters Email as {string}")
	public void user_enters_email_as(String string) throws InterruptedException {
		lp.Clickemail();
		lp.Emailsend();
		Thread.sleep(2000);

	}

	@When("Click on Next button")
	public void click_on_next_button() throws InterruptedException {
		lp.Clicknext();
		Thread.sleep(2000);
	}


	@When("Users enters Password as {string}")
	public void users_enters_password_as(String string) throws InterruptedException {
		lp.Passwordsend();
		Thread.sleep(2000);
	}

	// project creation


	@When("Click on project creation button")
	public void click_on_project_creation_button() throws InterruptedException {
		lp.Projectadd();
		Thread.sleep(5000);
	}

	@When("Enter project name")
	public void enter_project_name() throws InterruptedException {
		lp.Projectname();
		Thread.sleep(3000);
	}

	@When("Click on create project button")
	public void click_on_create_project_button() throws InterruptedException {
		lp.Projectcreationbutton();
		Thread.sleep(5000);
	}	
	
	@When("Get project title")
	public void get_project_title() {
	    lp.Projecttitle();
	}
	
	@When("Click on project menu option")
	public void click_on_project_menu_option() {
	    lp.Projectmenu();
	}

	@When("Click on delete option")
	public void click_on_delete_option() throws InterruptedException {
	  lp.Deleteoption();
	  Thread.sleep(5000);
	}

	@When("Type delete in box")
	public void type_delete_in_box() {
	    lp.Inputdelete();
	}

	@When("click yes,deleteproject button")
	public void click_yes_deleteproject_button() throws InterruptedException {
	    lp.Deletebutton();
	    Thread.sleep(5000);
	}

	@When("Get delete project title")
	public void get_delete_project_title() {
	    lp.Deletetitle();
	}

// Private project
	@When("Click on private option")
	public void Click_on_private_option() {
		lp.Privateoption();
	}
	
// project created through template then archieve the project
	@Then("Click on save as template option")
	public void click_on_save_as_template_option() throws InterruptedException {
	    lp.Savetemplate();
	    Thread.sleep(3000);
	    lp.Templatdetails();
	    Thread.sleep(3000);
	    System.out.println("Template sucessfully created");
	}

	@Then("Get template title")
	public void get_template_title() {
	    lp.Templatetitle();
	}

	@Then("Click on archieve project option")
	public void click_on_archieve_project_option() {
	    lp.Archievedproject();
	}

	@Then("Type archieve in box")
	public void type_archieve_in_box() throws InterruptedException {
	    lp.Inputarchive();
	    Thread.sleep(2000);
	}

	@Then("Click on yes, archieve project button")
	public void click_on_yes_archieve_project_button() throws InterruptedException {
	    lp.Archievebutton();
	    Thread.sleep(4000);
	    System.out.println("Sucessfully archieved project");
	}

	@Then("Get archieved project title")
	public void get_archieved_project_title() {
	    lp.Archivetitle();
	}
	
	// Duplicate project
	@Then("Click on dublicate option")
	public void click_on_dublicate_option() throws InterruptedException {
	    lp.Dublicateoption();
	    Thread.sleep(3000);
	}
	@Then("Click on dublicate project creation button")
	public void click_on_dublicate_project_creation_button() throws InterruptedException {
	    lp.Dublicateprojectbutton();
	}
	
	//Project edit
	@Then("Click on project setting option")
	public void click_on_project_setting_option() throws InterruptedException {
	    lp.Projectsetting();
	    Thread.sleep(3000);
	}

	@Then("Edit projectshortname")
	public void edit_projectshortname() throws InterruptedException {
	    lp.Projectshortname();
	    Thread.sleep(2000);
	}

	@Then("Get projectshortname title")
	public void get_projectshortname_title() {
	    lp.Getshortname();
	}

	@Then("Edit project name")
	public void edit_project_name() throws InterruptedException {
	    lp.Editprojectname();
	    Thread.sleep(2000);
	}

	@Then("Get project name title")
	public void get_project_name_title() {
	    lp.Getprojectname();
	}

	@Then("Change project colour")
	public void change_project_colour() throws InterruptedException {
	   lp.Editcolour();
	   Thread.sleep(2000);
	}

	@Then("click on save changes button")
	public void click_on_save_changes_button() throws InterruptedException {
	    lp.Savechanges();
	    Thread.sleep(5000);
	}
	
	
	// Task scenarios
	
	@Then("Click on add task field")
	public void click_on_add_task_field() throws InterruptedException {
		tp = new taskcreationpage(driver);
	   tp.Addtask();
	   Thread.sleep(2000);
	}

	@Then("Enter task name")
	public void enter_task_name() throws InterruptedException {
	    tp.Taskname();
	    Thread.sleep(1000);
	}

	@Then("Click on create button")
	public void click_on_create_button() throws InterruptedException {
	   tp.Createtask();
	   System.out.println("Task created succesfully");
	   Thread.sleep(2000);
	}

	@Then("Get task title")
	public void get_task_title() {
	   tp.tasktitle();
	}
	
	// Subtask creation
	
	@Then("Click on add new subtask")
	public void click_on_add_new_subtask() throws InterruptedException {
	    tp.Addsubtask();
	    Thread.sleep(2000);
	}

	@Then("Enter subtask name then enter")
	public void enter_subtask_name_then_enter() throws InterruptedException {
	    tp.Subtaskname();
	    System.out.println("Subtask created succesfully");
	    Thread.sleep(2000);
	}

	@Then("Get subtask title")
	public void get_subtask_title() {
	    tp.subtasktitle();
	}
	
	// Delete subtask and task
	@Then("Click on more option")
	public void click_on_more_option() throws InterruptedException {
	    tp.Moreoption();
	    Thread.sleep(2000);
	}

	@Then("Click on subtask delete option")
	public void click_on_subtask_delete_option() throws InterruptedException {
	    tp.Subtaskdelete();
	    Thread.sleep(2000);
	    System.out.println("Subtask deleted successfully");
	}

	@Then("Get deleted subtask title")
	public void get_deleted_subtask_title() {
	    tp.subtaskdeletetitle();
	}

	@Then("Click on task more option")
	public void click_on_task_more_option() throws InterruptedException {
	    tp.Taskoption();
	    Thread.sleep(2000);
	}

	@Then("Click on task delete option")
	public void click_on_task_delete_option() throws InterruptedException {
		tp.Taskdelete();
		Thread.sleep(2000);
		System.out.println("Task deleted successfully");
	}
	
	@Then("Get deleted task title")
	public void get_deleted_task_title() {
	    tp.taskdeletetitle();
	}
	
	// Task functionality
	
	@Then("Click on task")
	public void click_on_task() throws InterruptedException {
	   tp.Clicktask();
	   Thread.sleep(2000);
	}

	@Then("Add assignes in task")
	public void add_assignes_in_task() throws InterruptedException {
	    tp.Assignedassignes();
	    Thread.sleep(2000);
	    System.out.println("Assignes added successfully");
	}

	@Then("Get assignes title")
	public void get_assignes_title() {
	   tp.getassignestitle();
	}

	@Then("Add tags in task")
	public void add_tags_in_task() {
	    tp.Addtags();
	    System.out.println("Tags added successfully");
	}

	@Then("Get tags title")
	public void get_tags_title() {
	    tp.gettagtitle();
	}

	@Then("Add Dates in task")
	public void add_dates_in_task() throws InterruptedException {
	   tp.Adddate();
	   Thread.sleep(2000);
	   System.out.println("Date added successfully");
	}

	@Then("Get Dates title")
	public void get_dates_title() {
	    tp.getdatetitle();
	}

	@Then("Add story points in task")
	public void add_story_points_in_task() throws InterruptedException {
	    tp.Addstorypoint();
	    Thread.sleep(2000);
	    System.out.println("Story points added successfully");
	}

	@Then("Get story points title")
	public void get_story_points_title() {
	   tp.getstorytitle();
	}

	@Then("Add task description in task")
	public void add_task_description_in_task() throws InterruptedException {
	   tp.Adddescription();
	   Thread.sleep(2000);
	   System.out.println("Description added successfully");
	}

	@Then("Get task description title")
	public void get_task_description_title() {
	   tp.getdesctitle();
	}

	@Then("Add comments in task")
	public void add_comments_in_task() throws InterruptedException {
	   tp.Addcomments();
	   Thread.sleep(5000);
	   System.out.println("Comments added successfully");
	}

	@Then("Get comments title")
	public void get_comments_title() {
	    tp.getcommenttitle();
	}
	
	
	
	
	
	
	// Customfields
	
	@Then("Click on add customfields button")
	public void click_on_add_customfields_button() {
	    
	}

	@Then("Click on budget custom")
	public void click_on_budget_custom() {
	   
	}

	@Then("Enter budget custom name")
	public void enter_budget_custom_name() {
	    
	}

	@Then("Click on customfiled create button")
	public void click_on_customfiled_create_button() {
	    
	}

	@Then("Get budget title")
	public void get_budget_title() {
	   
	}

	@Then("Enter text custom name")
	public void enter_text_custom_name() {
	   
	}

	@Then("Get text title")
	public void get_text_title() {
	    
	}

	@Then("Click on dropdown custom")
	public void click_on_dropdown_custom() {
	    
	}

	@Then("Enter dropdown custom name")
	public void enter_dropdown_custom_name() {
	    
	}

	@Then("Get dropdown title")
	public void get_dropdown_title() {
	    
	}

	@Then("Click on Number custom")
	public void click_on_number_custom() {
	    
	}

	@Then("Enter Number custom name")
	public void enter_number_custom_name() {
	   
	}

	@Then("Get Number title")
	public void get_number_title() {
	    
	}

	@Then("Click on URL custom")
	public void click_on_url_custom() {
	    
	}

	@Then("Enter URL custom name")
	public void enter_url_custom_name() {
	    
	}

	@Then("Get URL title")
	public void get_url_title() {
	    
	}

	@Then("Click on Phone custom")
	public void click_on_phone_custom() {
	    
	}

	@Then("Enter Phone custom name")
	public void enter_phone_custom_name() {
	    
	}

	@Then("Get Phone title")
	public void get_phone_title() {
	   
	}

	@Then("Click on Email custom")
	public void click_on_email_custom() {
	   
	}

	@Then("Enter Email custom name")
	public void enter_email_custom_name() {
	   
	}

	@Then("Get Email title")
	public void get_email_title() {
	    
	}

	@Then("Click on Location custom")
	public void click_on_location_custom() {
	    
	}

	@Then("Enter Location custom name")
	public void enter_location_custom_name() {
	   
	}

	@Then("Get Location title")
	public void get_location_title() {
	   
	}

	@Then("Click on Currency custom")
	public void click_on_currency_custom() {
	    
	}

	@Then("Enter Currency custom name")
	public void enter_currency_custom_name() {
	   
	}

	@Then("Get Currency title")
	public void get_currency_title() {
	    
	}

	@Then("Click on Checkbox custom")
	public void click_on_checkbox_custom() {
	    
	}

	@Then("Enter Checkbox custom name")
	public void enter_checkbox_custom_name() {
	    
	}

	@Then("Get Checkbox title")
	public void get_checkbox_title() {
	    
	}

	@Then("Click on Date custom")
	public void click_on_date_custom() {
	    
	}

	@Then("Enter Date custom name")
	public void enter_date_custom_name() {
	   
	}

	@Then("Get Date title")
	public void get_date_title() {
	    
	}
	
}

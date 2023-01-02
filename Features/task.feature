Feature: Task

@Regression
Scenario Outline: Succesfully task and subtask created in project
      Given User Launch Chrome browser
      When User opens URL "https://niftyuat.com/"
      And User enters Email as "ankit.k+test000@gortnm.in" and Password as "12345678"
      And Click on Login
      And Click on project creation button
      And Enter project name
      And Click on create project button
      Then Get project title 
      And Click on add task field
      And Enter task name
      And Click on create button
      Then Get task title
      And Click on add new subtask
      And Enter subtask name then enter
      Then Get subtask title
      And close browser
      
@Sanity     
Scenario Outline: Succesfully deleted task and subtask in project
      Given User Launch Chrome browser
      When User opens URL "https://niftyuat.com/"
      And User enters Email as "ankit.k+test000@gortnm.in" and Password as "12345678"
      And Click on Login
      And Click on project creation button
      And Enter project name
      And Click on create project button
      Then Get project title 
      And Click on add task field
      And Enter task name
      And Click on create button
      Then Get task title
      And Click on add new subtask
      And Enter subtask name then enter
      Then Get subtask title
      And Click on more option
      And Click on subtask delete option
      Then Get deleted subtask title
      And Click on task more option
      And Click on task delete option
      Then Get deleted task title
      And close browser     
      
@Sanity1      
Scenario Outline: Succesfully add functionality in task
      Given User Launch Chrome browser
      When User opens URL "https://niftyuat.com/"
      And User enters Email as "ankit.k+test000@gortnm.in" and Password as "12345678"
      And Click on Login
      And Click on project creation button
      And Enter project name
      And Click on create project button
      Then Get project title 
      And Click on add task field
      And Enter task name
      And Click on create button
      Then Get task title
      And Click on task
      And Add assignes in task
      Then Get assignes title
      And Add tags in task
      Then Get tags title
      And Add Dates in task
      Then Get Dates title
      And Add story points in task
      Then Get story points title
      And Add task description in task
      Then Get task description title
      And Add comments in task       
      Then Get comments title
      And close browser 
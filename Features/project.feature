Feature: Project

@Smoke
Scenario Outline: Succesfully public project created then delete same project
      Given User Launch Chrome browser
      When User opens URL "https://niftyqa.com/"
      And User enters Email as "ankit.k+test000@gortnm.in" and Password as "12345678"
      And Click on Login
      And Click on project creation button
      And Enter project name
      And Click on create project button
      Then Get project title
      And Click on project menu option
      And Click on delete option
      And Type delete in box
      And click yes,deleteproject button
      Then Get delete project title
      And close browser

@Regression
Scenario Outline: Succesfully private project created then delete same project
      Given User Launch Chrome browser
      When User opens URL "https://niftyqa.com/"
      And User enters Email as "ankit.k+test000@gortnm.in" and Password as "12345678"
      And Click on Login
      And Click on project creation button
      And Enter project name
      And Click on private option
      And Click on create project button
      Then Get project title
      And Click on project menu option
      And Click on delete option
      And Type delete in box
      And click yes,deleteproject button
      Then Get delete project title
      And close browser   
      
@Sanity
Scenario Outline: Succesfully project created through template then archieve the project
      Given User Launch Chrome browser
      When User opens URL "https://niftyqa.com/"
      And User enters Email as "ankit.k+test000@gortnm.in" and Password as "12345678"
      And Click on Login
      And Click on project creation button
      And Enter project name
      And Click on create project button
      Then Get project title
      And Click on project menu option
      And Click on save as template option
      Then Get template title
      And Click on project menu option
      And Click on archieve project option
      And Type archieve in box
      And Click on yes, archieve project button
      Then Get archieved project title
      And close browser 
      
@Sanity1     
Scenario Outline: Succesfully project dublicated
      Given User Launch Chrome browser
      When User opens URL "https://niftyqa.com/"
      And User enters Email as "ankit.k+test000@gortnm.in" and Password as "12345678"
      And Click on Login
      And Click on project creation button
      And Enter project name
      And Click on create project button
      Then Get project title
      And Click on project menu option
      And Click on dublicate option
      And Click on dublicate project creation button
      Then Get project title
      And close browser 

@Sanity2
Scenario Outline: Succesfully project setting edited
      Given User Launch Chrome browser
      When User opens URL "https://niftyqa.com/"
      And User enters Email as "ankit.k+test000@gortnm.in" and Password as "12345678"
      And Click on Login
      And Click on project creation button
      And Enter project name
      And Click on create project button
      Then Get project title
      And Click on project menu option
      And Click on project setting option
      And Edit projectshortname
      Then Get projectshortname title
      And Edit project name
      Then Get project name title
      And Change project colour
      And click on save changes button
      And close browser
            
      
      
      
      
      
      

Feature: Customfields

Scenario: Succesfully add customfields in task
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
      And Click on add customfields button
      And Click on budget custom
      And Enter budget custom name
      And Click on customfiled create button
      Then Get budget title
      And Click on add customfields button
      And Enter text custom name
      And Click on customfiled create button
      Then Get text title
      And Click on add customfields button
      And Click on dropdown custom
      And Enter dropdown custom name
      And Click on customfiled create button
      Then Get dropdown title
      And Click on add customfields button
      And Click on dropdown custom
      And Enter dropdown custom name
      And Click on customfiled create button
      Then Get dropdown title
      And Click on add customfields button
      And Click on Number custom
      And Enter Number custom name
      And Click on customfiled create button
      Then Get Number title
      And Click on add customfields button
      And Click on URL custom
      And Enter URL custom name
      And Click on customfiled create button
      Then Get URL title
      And Click on add customfields button
      And Click on Phone custom
      And Enter Phone custom name
      And Click on customfiled create button
      Then Get Phone title
      And Click on add customfields button
      And Click on Email custom
      And Enter Email custom name
      And Click on customfiled create button
      Then Get Email title
      And Click on add customfields button
      And Click on Location custom
      And Enter Location custom name
      And Click on customfiled create button
      Then Get Location title
      And Click on add customfields button
      And Click on Currency custom
      And Enter Currency custom name
      And Click on customfiled create button
      Then Get Currency title
      And Click on add customfields button
      And Click on Checkbox custom
      And Enter Checkbox custom name
      And Click on customfiled create button
      Then Get Checkbox title
      And Click on add customfields button
      And Click on Date custom
      And Enter Date custom name
      And Click on customfiled create button
      Then Get Date title
      And close browser
      
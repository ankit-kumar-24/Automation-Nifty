Feature: Login

Scenario Outline: Successful Login with Valid Credential
      Given User Launch Chrome browser
      When User opens URL "https://niftyuat.com/"
      And User enters Email as "ankit.k+test000@gortnm.in" and Password as "12345678"
      And Click on Login
      And close browser
      
     
Scenario Outline: Successful login Using Google      
      Given User Launch Chrome browser
      When User opens URL "https://niftyuat.com/"
      And Click on google link
      And User enters Email as "ankit.k@gortnm.in"
      And Click on Next button
      And Users enters Password as "Ankitkumar2417"
      And Click on Next button
      And close browser
      
      

#Scenario: Successfully login using SSO
 #     Given User Launch Chrome browser
  #    When User opens URL "https://niftyuat.com/"
   #   And Click on SSO link
    #  And User enters Email as "ankit.k@gortnm.in"
     # And Click on Sign in withh SSO button
      #And close browser
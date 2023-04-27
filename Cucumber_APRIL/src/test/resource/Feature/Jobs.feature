Feature: Iam doing automation of Add Jobs and Add Nationality in Orange HRM 


Background: Commonsteps
Given User opens chroome browser
Then User opens application URL"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

@smoke
Scenario: Add Jobs
Given User enters Username as "Admin" and Password as "admin123"
When User creates Jobs record as
  |JobTitle   |JobDescription |JobNote     |
  |ENG 113    |ENG 113 DESC   |ENG 113 NOTE|
  |ENG 223    |ENG 223 DESC   |ENG 223 NOTE|
Then User logout 
And User close browser

@sanity @smoke
Scenario: Add Nationality
Given User enters Username as "Admin" and Password as "admin123"
When User creates Nationality record as
  |Rupee10001    |
  |Dollar20001   |
  |Currency30001 |
Then User logout 
And User close browser





Feature: homePage

Scenario: verify Homepage
Given user enters orange url as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When User enters username as "Admin" and password as "admin123" and cliks on login button
Then user verifies homepage title as "OrangeHRM"
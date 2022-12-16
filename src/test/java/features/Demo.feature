Feature: amazon searching fun



Scenario: Home Page Demo
Given user on amazon landing page
When user entered mobile number "9704219395" and password "Srin@dh2448"
And user searched for "one plus 10 pro" in search bar
Then user able to see products retated to one plus 10 pro

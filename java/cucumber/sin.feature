Feature:

Background:
Given I get the title

@onl
Scenario:
Given I lauched nyckaa
When I clicked seach box
And I searched Mens tshirt
And I clicked search button
Then I verify if the searched result appearing 

@not
Scenario:
Given I lauched nyckaa
When I clicked seach box
And I searched Mens tshirt
And I clicked search button
Then I verify if the searched result appearing 


@only1
Scenario Outline:abc
Given A "<names>"
When B
Then C
Examples:
  |names|
  |akash|
  |raj|
  |dharsan|
  
  @only
  Scenario:ABC2
  Given name and age
  |akash|10|
  |kasi|20|
  
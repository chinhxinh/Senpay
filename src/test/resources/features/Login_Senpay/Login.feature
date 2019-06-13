@tag
Feature: Login demo

  #Background:
  @tag1
  Scenario Outline: Login
    Given Login Senpay site with Phone "<phone>"
    And Login Senpay site with Pass "<pass>"
    And Find Fundin menu
   

    # When Input info "<phone>" on textbox "xpath=//input[@id='']"
    #And Click on Tim kiem button "xpath=//*[@id="__next"]/div/header/div[3]/div/div[1]/div[2]/div/button"
    #Then Assert search result on page "xpath=/html/body/div[10]/div/div[2]/div[1]/div/h1"
    Examples: 
      | phone      | pass   |
      | 0948961604 | 110615 |

Lookup a definition

Narrative:
In order to listen to music
As a user
I want to look up mp3 devices 


#Scenario: Looking at the 'mp3-speler aanbiedingen'
#Given the user is on the mp3shop home page
#When the user clicks on 'Aanbiedingen'
#Then the user clicks on 'Apple iPod Touch 6 16GB Blauw'

#Scenario: Log in mp3shop
#Given the user is on the mp3shop home page
#When the user clicks on 'Inloggen' 
#When the user types their emailaddress
#When the user types their password
#Then the user should click on 'js-login-submit'

Scenario: Compare the most expensive to the cheapest device
Given the user is on the mp3shop home page
When the user clicks on 'Alle mp3-spelers'
When the user checks Toevoegen aan vergelijking
When the user clicks on 'Prijs'
When the user checks Toevoegen aan vergelijking2
Then the user should click 'Bekijk vergelijking'


 
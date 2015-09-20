# ReadingFiles

ITEC 3150, Homework #1  - Intermediate Programming Review
Fall, 2015
Due Date:  no later than 11:59 PM on Sunday, August 30, 2015
Coding standards note:  The coding standards are in a document in a D2L module titled Coding Standards.  See Grading Criteria for points lost if not followed.
Create a program to track a game store inventory.  There should be multiple class describing the various games (INHERITANCE in action).  The parent game class will contain name, number of copies, and a unique id number for each game (not each copy).  There will be a child class for PC games, which has additional attributes for minimal memory requirements and minimal disk requirements.   A second child class will be for games that run on gaming consoles.  It will have additional attributes of platform name (either String or enumerated type), and platform version number (ie. If PlayStation is platform name, version 3 or 4, Xbox One or 360), finally a third child class for mobile gaming apps will contain additional attributes for mobile device type (iPhone, Android, Windows, etc) and version number of device type.

Your program will begin by reading a text file (created by you, in a format designed by you) with a minimum of two games per type (a total of six, 2 PC, 2 console, 2 apps) to create a list (think ArrayList) of the games in inventory.  Display the library list in a user friendly format, ask if the user would like to find or delete a game by id number.  When user is done viewing and deleting, save the changed list back to the original text file (overwriting it).  Extra credit for adding new games via user interface in a user friendly manner (up to 10 pts).
Interface to program may be textual or graphic (I don’t expect graphics yet!).  The program must use inheritance 
User interface must be minimally user-friendly.



Grading Criteria 
Compiles:	10
Correctly uses inheritance for games	20
Correctly lists library contents	20
Correctly finds (or doesn’t find) library item	15
Correctly reads text file	10
Correctly writes text file	10
Meets coding standards 	15


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**Class: InventoryTester.java
 * @author Adrianna Valdivia
 * @version 2.0
 * Course : ITEC 3150 Fall 2015
 * Written: August 25, 2015
*
*
* This class – now describe what the class does *
* Purpose: – Describe the purpose of this class 
* */

public class InventoryTester {

	private static ArrayList<Games> gameAL = new ArrayList<Games>();
		
	
	/**
	 * Method name: printGames
	 * Prints all games in gameAL, when method is called
	 */
	public static void printGames()
	   {
	      for (int i = 0; i < gameAL.size(); i++)
	      {
	         //GameLibrary temp = libraryItems.get(i);
	         System.out.println(gameAL.get(i));
	      }
	   }
	
	/**
	 * Method name: SearchByID
	 * @param id
	 * Use the getGameID method to equal ID when removing or searching
	 * Given by Dr.Johnson
	 */
	public Games searchById(String id)
	   {
	      Games item = null;
	      for (Games temp : gameAL)
	      {
	    	  //change back to string
	         if (temp.getGameID().equals(id))
	         {
	            item = temp;
	         }
	      }
	      return item;
	   }
	   
	   /**
	 * Method name: removeItem
	 * @param id
	 * method to remove item by entering game's ID
	 */
	public Games removeItem(int id)
	   {
	      return gameAL.remove(id);
	   }
	   
	/**
	 * @param args
	 * the main will open the text file to read and properly place the games from the list 
	 * into an easy to read manner use an array. 
	 */

	public static void main(String[] args) throws IOException 
	{
		// object to connect methods to main
		InventoryTester gameInventory = new InventoryTester();
		//gameInventory.getGameAL()
		
		// open file
		File inventorylist = new File("Games.txt");

		// open scanner to read the text file, if not will return message
		Scanner inventoryReader = null;
	      try
	      {
	    	  inventoryReader = new Scanner(inventorylist);
	      } 
	      catch (FileNotFoundException e)
	      {
	         System.out.println("No games found, inventory is empty");
	      }
	      
	      // As the scanner reads each line it will place each attribute into an array
	      // first nothing if weather it is a pc, mobile, or console game
	      // if not will return Unknown game type
	      while (inventoryReader.hasNextLine())
	    	  
			{
				String inventoryInfo = inventoryReader.nextLine();
				String[] gameArray = inventoryInfo.split(", ");

				if (gameArray.length == 6 && gameArray[0].equalsIgnoreCase("PC"))
				{
					PCgames pc = new PCgames(gameArray[1], gameArray[2], gameArray[3], gameArray[4], gameArray[5]);
					gameAL.add(pc);
				}
				else if (gameArray.length == 6 && gameArray[0].equalsIgnoreCase("Console") )
				{
					ConsoleGames cg = new ConsoleGames(gameArray[1], gameArray[2], gameArray[3], gameArray[4], gameArray[5]);
					gameAL.add(cg);
				}
				else if (gameArray.length == 6 && gameArray[0].equalsIgnoreCase("Mobile") )
				{
					MobileGames mg = new MobileGames(gameArray[1], gameArray[2], gameArray[3], gameArray[4], gameArray[5]);
					gameAL.add(mg);
				}
				else
		         {
		            System.out.println("Unknown game type " + inventoryInfo);
		         }
			}
	      
	      // This will allow the user to be able input their option which will
	      // include viewing, searching, or removing games
	      Scanner keyboard = new Scanner(System.in);

	      System.out.println("List of Games");
	      boolean done = false;
	      while (!done)
	      {
	         System.out.println("Please select an option :");
	         System.out.println("  1. View all games");
	         System.out.println("  2. Search for a game");
	         System.out.println("  3. Remove a game");
	         System.out.println("  4. Exit");
	         int userInput = keyboard.nextInt();
	         if (userInput == 1)
	         {
	            gameInventory.printGames();
	         } 
	         else if (userInput == 2)
	         {
	            System.out.println("Please enter and ID number");
	            String id = keyboard.next();
	            Games item = gameInventory.searchById(id);
	            if (item != null)
	            {
	               System.out.println(item);
	            } 
	            else
	            {
	               System.out.println("Sorry- item not found");
	            }
	         }
	         else if (userInput == 3)
	         {
	        	 System.out.println("Please enter an ID number");
	             int id = (keyboard.nextInt() - 1);
	             Games item = gameInventory.removeItem(id);
	             if (item != null)
	             {
	            	System.out.println("This game below will be deleted");
	                System.out.println(item);
	             } 
	             else
	             {
	                System.out.println("Sorry, the game you were looking for was not found.");
	                System.out.println("Please try again.");
	             }
	         }
	         else
	         {
	            done = true;
	            
	            PrintWriter out = null;
	            try
                {
                    out = new PrintWriter(new File("media.txt"));
                } catch (FileNotFoundException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
	            for (Games g : gameInventory.getGameAL())
                {
                    // first write the attributes common to all
                    out.println(gameAL);
                }
                out.close();    
	            
	         }
	      }
	}

	private ArrayList<Games> getGameAL() {
		// TODO Auto-generated method stub
		return gameAL;
	}
}

	

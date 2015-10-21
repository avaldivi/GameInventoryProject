import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**Class: InventoryTester.java
 * @author Adrianna Valdivia
 * @version 2.0
 * Course : ITEC 3150 Fall 2015
 * Written: August 25, 2015
*
*
* This class – will create an arraylist of objects read from the Games.txt file and put them
* 				into an array with help of the BST class. It will print Pre and Post order of Tree Nodes.
* Purpose: – To understand Binary Search Tree
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
	public static Games searchById(String id)
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
	public static Games removeItem(int id)
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
		//InventoryTester gameInventory = new InventoryTester();
		
	
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
	      while (inventoryReader != null && inventoryReader.hasNextLine())
	    	  
			{
				String inventoryInfo = inventoryReader.nextLine();
				String[] gameArray = inventoryInfo.split(", ");

				if (gameArray.length == 6 && gameArray[0].equalsIgnoreCase("PC"))
				{
					PCgames pc = new PCgames(gameArray[0],gameArray[1], gameArray[2], gameArray[3], gameArray[4], gameArray[5]);
					gameAL.add(pc);
					
				}
				else if (gameArray.length == 6 && gameArray[0].equalsIgnoreCase("Console") )
				{
					ConsoleGames cg = new ConsoleGames(gameArray[0],gameArray[1], gameArray[2], gameArray[3], gameArray[4], gameArray[5]);
					gameAL.add(cg);

				}
				else if (gameArray.length == 6 && gameArray[0].equalsIgnoreCase("Mobile") )
				{
					MobileGames mg = new MobileGames(gameArray[0],gameArray[1], gameArray[2], gameArray[3], gameArray[4], gameArray[5]);
					gameAL.add(mg);
				}
				else
		         {
		            System.out.println("Unknown game type " + inventoryInfo);
		         }
			}
	      
	      // Put gameAL into gameArray
	      Games[] gameArray =new Games [gameAL.size()];
	      
	      for (int i = 0; i < gameAL.size(); i++)
	      {
	    	  //GameLibrary temp = libraryItems.get(i);
	    	  gameArray[i] = gameAL.get(i); 
	    	  //System.out.println(gameAL.get(i));
	      }
	      
	      // Instance method to call BST class
	      BST<Games> tree = new BST<Games>(gameArray);
	      //Sort gameAL from compareTo method
	      Collections.sort(gameAL);
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
	         System.out.println("  4. Save and Exit");
	         int userInput = keyboard.nextInt();
	         if (userInput == 1)
	         {
	            printGames();
	         } 
	         else if (userInput == 2)
	         {
	            System.out.println("Please enter and ID number");
	            String id = keyboard.next();
	            Games item = searchById(id);
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
	             Games item = removeItem(id);
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
	            for (Games g : gameAL)
                {
                    // first write the attributes common to all
                    out.println(g);
                }
                out.close();   
            
	            
	         }
	         
	      }
	      
	      System.out.println("\n******Binary Search Tree Orders*******\n\n");
	      System.out.println("-------------Preorder------------\n");
	      tree.preorder();
	      System.out.println("-------------Postorder-----------\n");
          tree.postorder();
	}

	
	private ArrayList<Games> getGameAL() {
		// TODO Auto-generated method stub
		return gameAL;
	}
	
	
}

	

/**Class: Inventory.java
 * @author Adrianna Valdivia
 * @version 2.0
 * Course : ITEC 3150 Fall 2015
 * Written: August 25, 2015
*
*
* This class describes an inventory for games.
* Variables: gameName, numberOfCopies, gameID
* Purpose: Serves as a parent class, includes constructor, getters and setters, 
* 				and toString method.
* */
public class Games implements Comparable<Games>
{

	private String type;
	private String gameName;
	private String numberOfCopies;
	private String gameID;
	
	
	/**
	 * @param gameName
	 * @param numberOfCopies
	 * @param gameID
	 */
	public Games(String type, String gameName, String numberOfCopies, String gameID) 
	{
		this.type = type;
		this.gameName = gameName;
		this.numberOfCopies = numberOfCopies;
		this.gameID = gameID;
	}
	
	/**
	 * getter for gameName
	 * @return the name of the game
	 */
	public String getType() {
		return type;
	}

	/**
	 * setter for gameName
	 * @param gameName
	 */
	public void setType(String type) {
		this.type = type;
	}
	

	/**
	 * getter for gameName
	 * @return the name of the game
	 */
	public String getGameName() {
		return gameName;
	}

	/**
	 * setter for gameName
	 * @param gameName
	 */
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	/**
	 * getter for numberOfCopies
	 * @return the number of copies of the games
	 */
	public String getNumberOfCopies() {
		return numberOfCopies;
	}

	/**
	 * setter for numberOfCopies
	 * @param numberOfCopies
	 */
	public void setNumberOfCopies(String numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}

	/**
	 * getter for gameID
	 * @return the game's ID
	 */
	public String getGameID() {
		return gameID;
	}

	/**
	 * setter for gameID
	 * @param gameID
	 */
	public void setGameID(String gameID) {
		this.gameID = gameID;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return String.format("Type: %s\nGame name: %s\nNumber of copies: %s\nGame ID: %s\n", 
			this.type, this.gameName, this.numberOfCopies, this.gameID);
	}

	//Use name and gaming platform to determine less than or greater than. 
	//If name is alphabetically greater than or less than, use that to determine greater 
	//than or less than.  If name is alphabetically equal, 
	//use name of gaming platform to determine whether greater than or less 
	//than or equal to.
@Override
	public int compareTo(Games o) {
		if(this.gameName.compareTo(o.gameName)==0)
		{
			return this.type.compareTo(o.type);
		}
		else 
		{
			return 1;
		}
	
	
}
	
}

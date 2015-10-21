/**Class: ConsoleGames.java
 * @author Adrianna Valdivia
 * @version 2.0
 * Course : ITEC 3150 Fall 2015
 * Written: August 25, 2015
*
*
* This class describes Console Games
* Variables: gameName, numberOfCopies, gameID, consolePlatform, consoleVersion
* Purpose: – Child class of Inventory, Includes a Constructor, getters and setters, 
* 				and toString for variables
* */
public class ConsoleGames extends Games {
	
	private String consolePlatform;
	private String consoleVersion;
	
	/**
	 * 5 @param constructor
	 * @param gameName
	 * @param numberOfCopies
	 * @param gameID
	 */
	public ConsoleGames(String type,String gameName, String numberOfCopies, String gameID, String consolePlatform, String consoleVersion) {
		super(type,gameName, numberOfCopies, gameID);
		this.consolePlatform = consolePlatform;
		this.consoleVersion = consoleVersion;
	}

	/**
	 * getter for consolePlatform
	 * @return the platform of the console
	 */
	public String getConsolePlatform() {
		return consolePlatform;
	}

	/**
	 * setter for consolePlatform
	 * @param consolePlatform
	 */
	public void setConsolePlatform(String consolePlatform) {
		this.consolePlatform = consolePlatform;
	}

	/**
	 * getter for consoleVersion
	 * @return the version of the console
	 */
	public String getConsoleVersion() {
		return consoleVersion;
	}

	/**
	 * setter for consoleVersion
	 * @param consoleVersion
	 */
	public void setConsoleVersion(String consoleVersion) {
		this.consoleVersion = consoleVersion;
	}
	

	/* (non-Javadoc)
	 * @see Inventory#toString()
	 */
	@Override
	public String toString()
	{
		return String.format("%sConsole Platform: %s\n Console Version: %s\n",
				super.toString(),this.consolePlatform,this.consoleVersion);
	}
	
	

}

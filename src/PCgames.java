/**Class: PCgames.java
 * @author Adrianna
 * @version 2.0
 * Course : ITEC 3150 Fall 2015
 * Written: August 25, 2015
*
*
* This class describes PC games
* Variables: gameName, numberOfCopies, gameID, minMemoryReq, minDiscReq
* Purpose: – Child class of Inventory, Includes a Constructor, getters and setters, 
* 				and toString for variables
* */
public class PCgames extends Games {

	private String minMemoryReq;
	private String minDiscReq;
	
	/**
	 * 5 @param constructor
	 * @param gameName
	 * @param numberOfCopies
	 * @param gameID
	 * @param minMemoryReq
	 * @param minDiscReq
	 */
	public PCgames(String gameName, String numberOfCopies, String gameID, 
				String minMemoryReq, String minDiscReq) {
		
		super(gameName, numberOfCopies, gameID);
		this.minMemoryReq = minMemoryReq;
		this.minDiscReq = minDiscReq;
	}

	/**
	 * getter for minMemoryReq
	 * @return the minimum memory requirments
	 */
	public String getMinMemoryReq() {
		return minMemoryReq;
	}

	/**
	 * setter for minMemoryReq
	 * @param minMemoryReq
	 */
	public void setMinMemoryReq(String minMemoryReq) {
		this.minMemoryReq = minMemoryReq;
	}

	/**
	 * getter for minDiscReq
	 * @return minimum Disc requirement
	 */
	public String getMinDiscReq() {
		return minDiscReq;
	}

	/**
	 * setter for minDiscReq
	 * @param minDiscReq
	 */
	public void setMinDiscReq(String minDiscReq) {
		this.minDiscReq = minDiscReq;
	}
	
	/* (non-Javadoc)
	 * @see Inventory#toString()
	 */
	@Override
	public String toString()
	{
		return String.format("Type: PC\n%sMinimum Memory Requirments: %s\nMinimum Disc Requirement: %s\n",
				super.toString(),this.minMemoryReq,this.minDiscReq, super.toString());
	}

}

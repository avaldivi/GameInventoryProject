/**Class: MobileGames.java
 * @author Adrianna
 * @version 2.0
 * Course : ITEC 3150 Fall 2015
 * Written: August 25, 2015
*
*
* This class describes Mobile Games
* Variables: gameName, numberOfCopies, gameID, deviceType, deviceVersion
* Purpose: – Child class of Inventory, Includes a Constructor, getters and setters, 
* 				and toString for variables
* */
public class MobileGames extends Games {

	private String deviceType;
	private String deviceVersion;
	
	/**
	 * 5 @param constructor
	 * @param gameName
	 * @param numberOfCopies
	 * @param gameID
	 */
	public MobileGames(String type,String gameName, String numberOfCopies, String gameID, 
						String deviceType, String deviceVersion) {
		super(type,gameName, numberOfCopies, gameID);
		this.deviceType = deviceType;
		this.deviceVersion = deviceVersion;
	}

	/**
	 * getter for deviceType
	 * @return deviceType
	 */
	public String getDeviceType() {
		return deviceType;
	}

	/**
	 * setter for deviceType
	 * @param deviceType
	 */
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	/**
	 * getter for deviceVersion
	 * @return
	 */
	public String getDeviceVersion() {
		return deviceVersion;
	}

	/**
	 * setter for deviceVersion
	 * @param deviceVersion
	 */
	public void setDeviceVersion(String deviceVersion) {
		this.deviceVersion = deviceVersion;
	}

	/* (non-Javadoc)
	 * @see Inventory#toString()
	 */
	@Override
	public String toString()
	{
		return String.format( "%sDevice Type: %s\nDevice Version: %s\n",
				super.toString(),this.deviceType,this.deviceVersion);
	}
	
	

}

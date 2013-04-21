package mobOrganiser;

//note:  this is the new name of DataObject
public class OrganiserEntry {
	protected String name;
	protected int contactID;
	
	
	public OrganiserEntry() {
		
	}
	
	// TODO discuss
	public OrganiserEntry(String line) {
		
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}

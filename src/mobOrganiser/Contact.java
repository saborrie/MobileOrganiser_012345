package mobOrganiser;

public class Contact extends OrganiserEntry {

	String name;
	
	public Contact(String line) {
		this.name = line;
	}
	
	public String getName(){
		return name;
	}

	public String toString(){
		return name;
	}
	
}

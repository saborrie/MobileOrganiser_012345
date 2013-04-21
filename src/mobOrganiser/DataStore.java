package mobOrganiser;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class DataStore {
		
	static String contactsPath = "contacts.txt";
	static String notesPath = "notes.txt";
	static String eventsPath = "events.txt";
	
	static BufferedReader contactsIn;
	static BufferedReader eventsIn;
	static BufferedReader notesIn;
	
	static BufferedWriter contactsOut;
	static BufferedWriter eventsOut;
	static BufferedWriter notesOut;
	
	static ArrayList<OrganiserEntry> contacts = new ArrayList<OrganiserEntry>();
	static ArrayList<OrganiserEntry> notes = new ArrayList<OrganiserEntry>();
	static ArrayList<OrganiserEntry> events = new ArrayList<OrganiserEntry>();

	public static ArrayList<OrganiserEntry> getContacts(){
		return contacts;
	}
	
	public static ArrayList<OrganiserEntry> getDayData(Date date){
		ArrayList<OrganiserEntry> rv = (ArrayList<OrganiserEntry>) events.clone();
		rv.addAll(notes);
		return rv;
	}
	
	
	public static void readFile(){
		
		/*
			contactsOut = new BufferedWriter(new FileWriter(contactsPath));
			notesIn = new BufferedReader(new FileReader(notesPath));
			notesOut = new BufferedWriter(new FileWriter(notesPath));
			eventsIn = new BufferedReader(new FileReader(eventsPath));
			eventsOut = new BufferedWriter(new FileWriter(eventsPath));
		
		*/
		
		try{
			contactsIn = new BufferedReader(new FileReader(contactsPath));
			notesIn = new BufferedReader(new FileReader(notesPath));
			eventsIn = new BufferedReader(new FileReader(eventsPath));
			
			String line;
			
			while((line = contactsIn.readLine()) != null) {
				contacts.add(new Contact(line));
			}
			while((line = notesIn.readLine()) != null) {
				notes.add(new Contact(line));
			}
			while((line = eventsIn.readLine()) != null) {
				events.add(new Contact(line));
			}
			
			
			
			contactsIn.close();
			notesIn.close();
			eventsIn.close();
			
		} catch(IOException e) {
			
		}
	}
	
}

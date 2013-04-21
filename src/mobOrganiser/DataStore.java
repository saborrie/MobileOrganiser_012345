package mobOrganiser;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

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
			
			String line;
			
			while((line = contactsIn.readLine()) != null) {
				contacts.add(new Contact(line));
			}
			
			contactsIn.close();
			
		} catch(IOException e) {
			
		}
	}
	
}

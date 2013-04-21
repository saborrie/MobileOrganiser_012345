package mobOrganiser;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Contact extends OrganiserEntry {

	private String telephone;
	private String Birthday;
	private String email;
	private String encoded;
	private static SimpleDateFormat birthdayFormat = new SimpleDateFormat("dd/MM/yyyy");

	/**
	 * takes a line from the file decodes it each line contains data in this
	 * order
	 * 
	 * 1. name 2.telephone 3.birthday 4.email seperated by back slashes
	 */
	private void decodeLine(){
		//split as many times as possible 
		String[] dataArray=encoded.split("\\", -1);
		if(dataArray[0]==" "){
			System.err.println("NAME BLANK");
		}else{
			setName(dataArray[0]);
			if(dataArray[1].matches("(\\d+)?")||dataArray[1].equals(" ")){
				setTelephone(dataArray[1]);
			}
			if(isValidDate(dataArray[2])|| dataArray[2].equals(" ")){
				try {
					setBirthday(dataArray[2]);
				} catch (ParseException e) {
				}
			} else{
				System.err.println("Not a valid date.");
			}
			if(dataArray[3].contains("@")||dataArray[3].equals(" ")){
				setEmail(dataArray[3]);
			}
			else{
				System.err.println("Not a valid email");
			}
			
			
				
			
		}
	}

	/**
	 * @param telephone
	 *            the telephone number to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * Creates a date object from a string.
	 * 
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	private static String createBirthday(String date) throws ParseException {
		
		// format must be strictly defined
		birthdayFormat.setLenient(false);
		Date withTime=birthdayFormat.parse(date);
		String noTime=birthdayFormat.format(withTime);
		return noTime;
	}

	/**
	 * @param birthday
	 *            the birthday to set
	 * @throws ParseException
	 */
	public void setBirthday(String birthday) throws ParseException {
		Birthday = createBirthday(birthday);
	}

	/**
	 * check if string is a valid date
	 * 
	 * @param date
	 * @return
	 */
	private boolean isValidDate(String date) {
		SimpleDateFormat birthdayFormat = new SimpleDateFormat("dd/MM/yyyy");
		// format must be strictly defined
		birthdayFormat.setLenient(false);
		try {
			birthdayFormat.parse(date);
		} catch (ParseException e) {
			return false;
		}
		return true;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * constructor to create contact from file
	 * 
	 * @param line
	 */
	public Contact(String line) {
		super(line);
		this.encoded = line;
		decodeLine();
	}

	// empty constructor for new contact TODO later
	public Contact() {
		super();

	}

	public String toString() {
		return name;
	}

}

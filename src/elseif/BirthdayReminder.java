
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "October 11th";
		String myBirthday = "September 9th";

		String bday = JOptionPane.showInputDialog("Who's birthday do you want to know?");
		// 3. Print out what the user typed

		// 4. if user asked for "mom"
		if (bday.equalsIgnoreCase("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		}
		// print mom's birthday
		// 5. if user asked for "dad"
		
		// print dad's birthday
		// 6. if user asked for your name
		// print myBirthday
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"

}

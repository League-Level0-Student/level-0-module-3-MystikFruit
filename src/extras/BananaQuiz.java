//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extras;

import javax.swing.JOptionPane;

public class BananaQuiz {

	public static void main(String[] args) {
		// 1. ask the user if they like bananas
		String banana = JOptionPane.showInputDialog("Do you like bananas?");
		if (banana.equalsIgnoreCase("No")) {
			JOptionPane.showMessageDialog(null, "You are crazy!");
		} else if (banana.equalsIgnoreCase("yes")) {
			String hobby = JOptionPane.showInputDialog("What is your favorite hobby");
			JOptionPane.showMessageDialog(null, hobby + " is much better with bananas!");
		} else {
			JOptionPane.showMessageDialog(null, "You are bananas!");
		}

	}

}

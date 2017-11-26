//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] cheese) {
		int random = new Random().nextInt(100);
		random++;
		System.out.println(random);

		for (int i = 0; i < 10; i++) {

			String num = JOptionPane.showInputDialog("Guess the number I'm thinking of.");

			int x = Integer.parseInt(num);

			if (x == random) {
				JOptionPane.showMessageDialog(null, "Correct!");
			} else if (x > random) {
				JOptionPane.showMessageDialog(null, "Too high");
			} else if (x < random) {
				JOptionPane.showMessageDialog(null, "Too low");
			}

		}

		JOptionPane.showMessageDialog(null, "You lose...");
	}
}
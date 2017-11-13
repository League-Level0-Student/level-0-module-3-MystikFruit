//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		String cat = JOptionPane.showInputDialog("How many cats do you have?");

		int num = Integer.parseInt(cat);

		if (3 < num) {
			JOptionPane.showMessageDialog(null, "You are a crazy cat lady!");
		} else if (0 == num) {
			playVideo("https://www.youtube.com/watch?v=W_juM14WHNQ");

		} else if (3 >= num) {
			playVideo("https://www.youtube.com/watch?time_continue=6&v=J---aiyznGQ");
		}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

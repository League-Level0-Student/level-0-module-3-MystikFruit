//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extras;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot();
	public static void main(String[] args) {
		
		String kjlh= JOptionPane.showInputDialog("How dizzy do you want the robot to be from 1-10?");
		int num=Integer.parseInt(kjlh);
dance(num);	
	}
	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			robot.setSpeed(10);
			robot.turn(360);
		}
	}
}


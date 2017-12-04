
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot rob = new Robot();
		int r = 21;
		int g = 59;
		int b = 94;

		for (int i = 0; i < 100000; i++) {
			String color = JOptionPane.showInputDialog("What color do you want the robot to draw in?");

			if (color.equalsIgnoreCase("gold")) {
				rob.setPenColor(242, 192, 55);
			} else if (color.equalsIgnoreCase("blue")) {
				rob.setPenColor(51, 146, 234);
			} else if (color.equals("gradient")) {
				rob.setPenColor(r, g, b);
			} else if (color.equalsIgnoreCase("purple")) {
				rob.setPenColor(137, 73, 183);
			} else if (color.equalsIgnoreCase("red")) {
				rob.setPenColor(216, 52, 52);
			} else if (color.equalsIgnoreCase("yellow")) {
				rob.setPenColor(255, 233, 0);
			} else if (color.equalsIgnoreCase("pink")) {
				rob.setPenColor(255, 71, 245);
			} else if (color.equalsIgnoreCase("orange")) {
				rob.setPenColor(252, 154, 35);
			} else if (color.equalsIgnoreCase("green")) {
				rob.setPenColor(96, 242, 142);
			} else {
				rob.setRandomPenColor();
			}
			rob.penDown();
			rob.setPenWidth(10);
			rob.setSpeed(10);
			rob.setY(200);
			rob.setX(275);
			rob.move(60);
			rob.setAngle(90);
			if (color.equalsIgnoreCase("gradient")) {
				for (int j = 0; i < 250; i++) {
					rob.move(1);
					r++;
					g++;
					b++;
					rob.setPenColor(r, g, b);
				}
			} else
				rob.move(250);

			rob.setAngle(180);
			if (color.equalsIgnoreCase("gradient")) {
				for (int j = 0; i < 150; i++) {
					rob.move(1);
					r++;
					g++;
					b++;
					rob.setPenColor(r, g, b);
				}
			} else
				rob.move(150);

			rob.setAngle(270);
			if (color.equalsIgnoreCase("gradient")) {
				for (int j = 0; i < 250; i++) {
					rob.move(1);
					r++;
					g++;
					b++;
					rob.setPenColor(r, g, b);
				}
			} else
				rob.move(250);
			rob.setAngle(360);
			if (color.equalsIgnoreCase("gradient")) {
				for (int j = 0; i < 90; i++) {
					rob.move(1);
					r++;
					g++;
					b++;
					rob.setPenColor(r, g, b);
				}
			} else
				rob.move(90);

		}
	}
}
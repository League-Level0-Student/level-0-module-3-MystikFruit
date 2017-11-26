
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot rob = new Robot();

		//3. ask the user what color they would like the robot to draw
		
		//4. use an if/else statement to set the pen color that the user requested

        //5. if the user doesn’t enter anything, choose a random color

        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		
	    //1. make the robot draw a shape (this will take more than one line of code)
		 rob.penDown();
		 rob.setPenWidth(5);
		 rob.setSpeed(10);
		 rob.setY(290);
		 rob.setX(250);
		 rob.setAngle(35);
		 rob.move(150);	
		 rob.setAngle(-145);
		 rob.move(75);
		 rob.setAngle(-45);
		 rob.move(75);
		 rob.setAngle(135);
		 rob.penUp();
		 rob.move(100);
		 rob.setAngle(90);
		 rob.move(80);
		 rob.setAngle(0);
		 rob.penDown();
		 rob.move(100);
		 rob.setAngle(90);
		 rob.move(50);
		 rob.setAngle(180);
		 rob.move(100);
		 rob.setAngle(270);
		 rob.setAngle(50);
	}
}

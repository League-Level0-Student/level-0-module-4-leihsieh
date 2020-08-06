package _02_boolean._1_sleepy_head;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		// Write code to ask the user what day it is.
        
		String day = JOptionPane.showInputDialog("What day is it?");
		
		if(day.equalsIgnoreCase("Sunday") || day.equalsIgnoreCase("Saturday")) {
			boolean isWeekend = true;
			System.out.println(isWeekend);
		}
		else {
			boolean isWeekend = false;
			System.out.println(isWeekend);
		}
		
		// Set the boolean isWeekend based on the value they enter
				
		// If it is the weekend, tell the user they get to sleep in.
		
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		
		/************************   STAR STUDENT  **************************/

		// Write code to ask the user what percentage they scored in their last exam
		String input = JOptionPane.showInputDialog("What did you get on your exam?");
		
		// If they scored more than 70, they passed the exam.
		
		// Set the boolean passedExam based on their score.
		int score = Integer.parseInt(input);
		
		if (score >= 70) {
			JOptionPane.showMessageDialog(null, "Wow you passed");
			boolean passedExam = true;
		}
		
		// If the user passed the exam, congratulate them
		
		// otherwise, wish them better luck next time.
		else {
			JOptionPane.showMessageDialog(null, "Better luck next time.");
		}
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true

		}
		// Tell the user "game is over" 
		JOptionPane.showMessageDialog(null, "game is over");
		
		/***********************   RED SQUARE  ********************/
		
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String color = JOptionPane.showInputDialog("What color do you want to draw with?");
		boolean isRed = false;
		if (color.equalsIgnoreCase("red")) {
			isRed = true;
		}
		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		String shape = JOptionPane.showInputDialog("What shape would you like drawn?");
		boolean isSquare = false;
		if (shape.equalsIgnoreCase("square")) {
			isSquare = true;
		}
		// Now you MUST use the && operator to join the booleans for this code. 
		if (isRed == true && isSquare == true) {
			drawRedSquare();
		}
		else {
			JOptionPane.showMessageDialog(null, "I don't know how to draw that shape.");
		}
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		

	}

	
	static void drawRedSquare() {
		Robot rob = new Robot();
		// Complete the rest of this method
		rob.setPenColor(Color.red);
		rob.penDown();
		rob.setSpeed(10);
		for(int i = 0; i < 4; i++) {
			rob.move(150);
			rob.turn(90);
		}
	}	
}

package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		Robot BB8=new Robot ();
		BB8.setSpeed(10);
		BB8.setRandomPenColor();
		BB8.penDown();
		//BB8.setPenColor(0,0, 225);
		BB8.move(333);
		BB8.turn(90);
		BB8.move(333);
		BB8.turn(90);
		BB8.move(333);
		BB8.turn(90);
		BB8.move(333);
		

	for (int i = 0; i < 4; i++) {BB8.move(333); BB8.turn(90);
		
	}
		
	
	}
}

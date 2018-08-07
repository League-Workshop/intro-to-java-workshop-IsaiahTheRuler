package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot ABCD= new Robot();
		ABCD.changeRobot("https://www.famousbirthdays.com/headshots/lil-pump-6.jpg");
		ABCD.setSpeed(100);
		ABCD.penDown();
		int sides= 17;
		int angle=360/sides;
		for(int i=0;i<sides;i++) {
			ABCD.move(100);
			ABCD.turn(angle);
			
		}
	
	    ABCD.sparkle();
		
		
		
		
	
	
		
		
	}
}

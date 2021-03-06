package _02_nested_loops._1_snowflake;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Snowflake {

	public static void main(String[] args) throws InterruptedException {

		// #1. Make a new Robot
		Robot bob = new Robot();

		// #2. Set your robot’s position to x=300 and y=300
		bob.setX(300);
		bob.setY(300);

		// #3. Put the robot's pen down
		bob.penDown();

		// #4. Set the robot’s speed to 5
		bob.setSpeed(5);

		// #5. use a for loop below to do everything ( #6, #7, #8, #9, #12, #13, #14 ) 6
		// times (use i as the counter)
		for (int i = 0; i < 100; i++) {

			
			bob.microMove(20);
			bob.setPenColor(24, 170, 170);
			bob.microTurn(10);
			bob.microMove(10);
			bob.setPenColor(0, 0, 0);
			bob.microTurn(20);

		}

	}

	private static int bob() {
		// TODO Auto-generated method stub
		return 0;
	}

	// #6. Set the pen color to black

	// #7. move the robot by 50

	// #8. turn the robot to the right by 60

	// #12. set the pen color to blue for even numbers of i

	// #13. set the pen color to red for all odd numbers of i

	// #9. Use a for loop to do everything (#10, #11) 6 times ( use j as a counter )

	// #10. turn the robot to the left by 60

	// #11. move the robot by 50 (play the start button)

	// #14. set the pen color to black

}

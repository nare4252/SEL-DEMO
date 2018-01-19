package com.annotations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class RobotNotepad {

	public static void main(String[] args) throws IOException, AWTException,
			InterruptedException {
		Runtime runtime = Runtime.getRuntime();
		runtime.exec("notepad.exe");

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_H);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_E);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_L);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_L);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_O);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_SPACE);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_T);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_H);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_I);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_S);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_SPACE);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_P);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_R);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_O);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_G);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_R);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_M);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_SPACE);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_W);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_S);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_SPACE);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_C);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_R);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_E);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_T);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_E);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_D);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_SPACE);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_B);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_Y);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_SPACE);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_N);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_R);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_E);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_N);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_D);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_E);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_R);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_SPACE);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_B);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_L);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_L);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_A);

	}

}

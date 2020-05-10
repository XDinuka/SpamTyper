package main;

import jdk.internal.org.objectweb.asm.Handle;

import java.awt.*;
import java.awt.event.KeyEvent;

public class EnterKeyHandler implements Handler {

    private Robot robot;
    private static EnterKeyHandler enterKeyHandler;

    private EnterKeyHandler(Robot robot) {
        this.robot = robot;
    }

    public static EnterKeyHandler getInstance(Robot robot) {
        if (EnterKeyHandler.enterKeyHandler == null)
            enterKeyHandler = new EnterKeyHandler(robot);
        return enterKeyHandler;
    }

    public void handle() {
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

}

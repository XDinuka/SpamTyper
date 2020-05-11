package main;


import java.awt.Robot;
import java.awt.event.KeyEvent;

public class EnterKeyHandler implements Handler {


    private static EnterKeyHandler enterKeyHandler;

    private EnterKeyHandler() {

    }

    public static EnterKeyHandler getInstance() {
        if (EnterKeyHandler.enterKeyHandler == null) {
            synchronized (EnterKeyHandler.class) {
                if (EnterKeyHandler.enterKeyHandler == null) {
                    enterKeyHandler = new EnterKeyHandler();
                }
            }
        }
        return enterKeyHandler;
    }

    public void handle(Robot robot) {
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

}

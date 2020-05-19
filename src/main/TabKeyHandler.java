package main;


import java.awt.Robot;
import java.awt.event.KeyEvent;

public class TabKeyHandler implements Handler {


    private static TabKeyHandler tabKeyHandler;

    private TabKeyHandler() {

    }

    public static TabKeyHandler getInstance() {
        if (TabKeyHandler.tabKeyHandler == null) {
            synchronized (TabKeyHandler.class) {
                if (TabKeyHandler.tabKeyHandler == null) {
                    tabKeyHandler = new TabKeyHandler();
                }
            }
        }
        return tabKeyHandler;
    }

    public void handle(Robot robot) {
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
    }

}

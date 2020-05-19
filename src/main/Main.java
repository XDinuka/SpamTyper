package main;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Main {

    public static void main(String[] args) {

        int initial_delay = 50;
        int delay = 200;
        int count = 10;

        try {
            Robot robot = new Robot();
            robot.setAutoDelay(delay);

//            StaticTextHandler staticTextHandler = new StaticTextHandler("Hello");
//            TabKeyHandler tabKeyHandler = TabKeyHandler.getInstance();
//            StaticTextHandler staticTextHandler2 = new StaticTextHandler("World");
//            IterativeTextHandler iterativeTextHandler = new IterativeTextHandler( 1, 1);
//            EnterKeyHandler enterKeyHandler = EnterKeyHandler.getInstance();

            CombinedKeysHandler combinedKeysHandler = new CombinedKeysHandler(KeyEvent.VK_ALT,KeyEvent.VK_TAB);

            Thread.sleep(initial_delay);

            for (int i = 0; i < count; i++) {
//                staticTextHandler.handle(robot);
//                tabKeyHandler.handle(robot);
//                staticTextHandler2.handle(robot);
//                tabKeyHandler.handle(robot);
//                iterativeTextHandler.handle(robot);
//                enterKeyHandler.handle(robot);
                combinedKeysHandler.handle(robot);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

package main;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        try {
            Robot robot = new Robot();
            robot.setAutoDelay(20);
            StaticTextHandler staticTextHandler = new StaticTextHandler(robot, "hello");
            IterativeTextHandler iterativeTextHandler = new IterativeTextHandler(robot, 1, 1);
            EnterKeyHandler enterKeyHandler = EnterKeyHandler.getInstance(robot);


            for (int i = 0; i < 10; i++) {
                staticTextHandler.handle();
                iterativeTextHandler.handle();
                enterKeyHandler.handle();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

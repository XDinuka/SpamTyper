package main;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class IterativeTextHandler implements Handler {


    private int number;
    private int delta;

    public IterativeTextHandler( int start, int delta) {
        this.number = start;
        this.delta = delta;
    }

    public void handle(Robot robot) {

        char[] text = String.valueOf(number).toCharArray();
        int[] keyCodes = new int[text.length];
        for (int i = 0; i < text.length; i++) {
            keyCodes[i] = KeyEvent.getExtendedKeyCodeForChar(text[i]);
        }

        for (int i = 0; i < text.length; i++) {
            robot.keyPress(keyCodes[i]);
            robot.keyRelease(keyCodes[i]);
        }

        number = number + delta;
    }
}

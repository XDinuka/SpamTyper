package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.Key;

public class StaticTextHandler implements Handler {

    private Robot robot;
    private char[] text;
    private int[] keyCodes;

    public StaticTextHandler(Robot robot, String string) {
        if (robot == null || string == null || string.isEmpty())
            throw new NullPointerException("StaticTextHandler expects all parameters to be not null");
        this.robot = robot;
        this.text = string.toCharArray();
        keyCodes = new int[text.length];
        for (int i = 0; i < text.length; i++) {
            keyCodes[i] = KeyEvent.getExtendedKeyCodeForChar(text[i]);
        }

    }


    public void handle() {

        for (int i = 0; i < text.length; i++) {
            boolean upperCase = Character.isUpperCase(text[i]);

            if (upperCase)
                robot.keyPress(KeyEvent.VK_SHIFT);

            robot.keyPress(keyCodes[i]);
            robot.keyRelease(keyCodes[i]);

            if (upperCase)
                robot.keyRelease(KeyEvent.VK_SHIFT);
        }
    }

}

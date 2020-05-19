package main;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class StaticTextHandler implements Handler {


    private char[] text;
    private int[] keyCodes;

    public StaticTextHandler( String string) {
        if (string == null || string.isEmpty())
            throw new NullPointerException("StaticTextHandler expects all parameters to be not null");
        this.text = string.toCharArray();
        keyCodes = new int[text.length];
        for (int i = 0; i < text.length; i++) {
            keyCodes[i] = KeyEvent.getExtendedKeyCodeForChar(text[i]);
        }

    }

    @Override
    public void handle(Robot robot) {

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

package main;

import java.awt.Robot;

public class CombinedKeysHandler implements Handler {

    private Integer[] keys;

    public CombinedKeysHandler(Integer... keys) {
        this.keys = keys;

    }

    @Override
    public void handle(Robot robot) {
        for (int i : keys) {
            robot.keyPress(i);
        }
        for (int i = keys.length - 1; i > -1; i--) {
            robot.keyRelease(keys[i]);
        }
    }

}

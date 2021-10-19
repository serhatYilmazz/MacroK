package org.macrok.action.ranger;

import org.macrok.action.DefenseAction;
import org.macrok.constants.GlobalConstants;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.awt.event.KeyEvent;

@Service
public class RangerDefenseAction implements DefenseAction, RangerAction {

    @Override
    public void act(Robot robot) {
        try {
            Thread.sleep(GlobalConstants.INITIAL_DELAY.getDelay());
            while (true) {
                robot.keyPress(KeyEvent.VK_5);
                Thread.sleep(100);
                robot.keyRelease(KeyEvent.VK_5);
                Thread.sleep(1000);
                robot.keyPress(KeyEvent.VK_6);
                Thread.sleep(100);
                robot.keyRelease(KeyEvent.VK_6);
                Thread.sleep(12000);
            }
        } catch (InterruptedException e) {
            System.out.println(getActionName() + " is cancelled");
        }
    }

    @Override
    public String getActionName() {
        return "Defense";
    }
}

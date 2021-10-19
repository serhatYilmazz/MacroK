package org.macrok.action.priest;

import org.macrok.action.DefenseAction;
import org.macrok.constants.GlobalConstants;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.awt.event.KeyEvent;

@Service
public class PriestDefenseAction implements DefenseAction, PriestAction {

    @Override
    public void act(Robot robot) {
        try {
            Thread.sleep(GlobalConstants.INITIAL_DELAY.getDelay());
            while (true) {
                robot.keyPress(KeyEvent.VK_X);
                Thread.sleep(100);
                robot.keyRelease(KeyEvent.VK_X);
                Thread.sleep(100);

                robot.keyPress(KeyEvent.VK_6);
                Thread.sleep(100);
                robot.keyRelease(KeyEvent.VK_6);
                Thread.sleep(3000);

                robot.keyPress(KeyEvent.VK_7);
                Thread.sleep(100);
                robot.keyRelease(KeyEvent.VK_7);
                Thread.sleep(3000);

                robot.keyPress(KeyEvent.VK_8);
                Thread.sleep(100);
                robot.keyRelease(KeyEvent.VK_8);

                Thread.sleep(600000);
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

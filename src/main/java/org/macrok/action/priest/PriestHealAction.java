package org.macrok.action.priest;

import org.macrok.action.Action;
import org.macrok.constants.GlobalConstants;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.awt.event.KeyEvent;

@Service
public class PriestHealAction implements Action, PriestAction {

    @Override
    public void act(Robot robot) {
        try {
            Thread.sleep(GlobalConstants.INITIAL_DELAY.getDelay());
            while (true) {
                robot.keyPress(KeyEvent.VK_X);
                Thread.sleep(100);
                robot.keyRelease(KeyEvent.VK_X);
                Thread.sleep(100);

                robot.keyPress(KeyEvent.VK_4);
                Thread.sleep(100);
                robot.keyRelease(KeyEvent.VK_4);

                Thread.sleep(60000);
            }
        } catch (InterruptedException e) {
            System.out.println(getActionName() + " is cancelled");
        }
    }

    @Override
    public String getActionName() {
        return "Heal";
    }

}

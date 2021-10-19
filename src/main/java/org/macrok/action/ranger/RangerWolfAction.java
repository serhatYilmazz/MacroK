package org.macrok.action.ranger;

import org.macrok.action.AttackAction;
import org.macrok.constants.GlobalConstants;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.awt.event.KeyEvent;

@Service
public class RangerWolfAction implements AttackAction, RangerAction {

    @Override
    public void act(Robot robot) {
        try {
            Thread.sleep(GlobalConstants.INITIAL_DELAY.getDelay());
            while (true) {
                robot.keyPress(KeyEvent.VK_4);
                Thread.sleep(100);
                robot.keyRelease(KeyEvent.VK_4);
                Thread.sleep(500);
                robot.keyPress(KeyEvent.VK_4);
                Thread.sleep(100);
                robot.keyRelease(KeyEvent.VK_4);
                Thread.sleep(700);
                robot.keyPress(KeyEvent.VK_4);

                Thread.sleep(123500);
            }
        } catch (InterruptedException e) {
            System.out.println(getActionName() + " is cancelled");
        }
    }

    @Override
    public String getActionName() {
        return "Wolf";
    }
}

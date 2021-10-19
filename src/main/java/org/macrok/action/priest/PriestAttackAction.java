package org.macrok.action.priest;

import org.macrok.action.AttackAction;
import org.macrok.constants.GlobalConstants;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.awt.event.KeyEvent;

@Service
public class PriestAttackAction implements AttackAction, PriestAction {

    @Override
    public void act(Robot robot) {
        try {
            Thread.sleep(GlobalConstants.INITIAL_DELAY.getDelay());
            while (true) {
                robot.keyPress(KeyEvent.VK_Q);
                Thread.sleep(100);
                robot.keyRelease(KeyEvent.VK_Q);
                Thread.sleep(200);
                robot.keyPress(KeyEvent.VK_2);
                Thread.sleep(100);
                robot.keyRelease(KeyEvent.VK_2);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(getActionName() + " is cancelled");
        }
    }

    @Override
    public String getActionName() {
        return "Attack";
    }
}

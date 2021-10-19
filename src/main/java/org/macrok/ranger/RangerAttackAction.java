package org.macrok.ranger;

import org.macrok.action.AttackAction;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.awt.event.KeyEvent;

@Service
public class RangerAttackAction implements AttackAction, RangerAction {

    @Override
    public void act(Robot robot) {
        try {
            Thread.sleep(2000);
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
            System.out.println("Cancelled");
        }
    }

    @Override
    public String getActionName() {
        return "Attack";
    }
}

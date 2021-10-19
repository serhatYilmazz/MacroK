package org.macrok.ranger;

import org.macrok.action.AttackAction;
import org.springframework.stereotype.Service;

import java.awt.*;

@Service
public class RangerAttackAction implements AttackAction, RangerAction {

    @Override
    public void act(Robot robot) {

    }

    @Override
    public String getActionName() {
        return "Attack";
    }
}

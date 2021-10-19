package org.macrok.ranger;

import org.macrok.action.DefenseAction;
import org.springframework.stereotype.Service;

import java.awt.*;

@Service
public class RangerDefenseAction implements DefenseAction, RangerAction {

    @Override
    public void act(Robot robot) {

    }

    @Override
    public String getActionName() {
        return "Defense";
    }
}

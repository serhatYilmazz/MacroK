package org.macrok.role;

import org.macrok.action.Action;
import org.macrok.action.AttackAction;
import org.macrok.action.DefenseAction;

import java.util.Collection;

public interface Role {
    AttackAction getAttackAction();
    DefenseAction getDefenseAction();
    Collection<? extends Action> getActions();
    String getRoleName();
}

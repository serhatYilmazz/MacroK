package org.macrok.role;

import org.macrok.action.AttackAction;
import org.macrok.action.DefenseAction;

public interface Role {
    AttackAction getAttackAction();
    DefenseAction getDefenseAction();
    String getRoleName();
}

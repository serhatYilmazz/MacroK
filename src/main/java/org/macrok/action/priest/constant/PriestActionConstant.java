package org.macrok.action.priest.constant;

import lombok.Getter;
import org.macrok.action.priest.PriestAttackAction;
import org.macrok.action.priest.PriestDefenseAction;

@Getter
public enum PriestActionConstant {
    ATTACK(PriestAttackAction.class.getName()),
    DEFENSE(PriestDefenseAction.class.getName());

    private final String value;

    PriestActionConstant(String value) {
        this.value = value;
    }

}

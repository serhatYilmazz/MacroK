package org.macrok.action.ranger.constant;

import lombok.Getter;
import org.macrok.action.ranger.RangerAttackAction;
import org.macrok.action.ranger.RangerDefenseAction;

@Getter
public enum RangerActionConstant {
    ATTACK(RangerAttackAction.class.getName()),
    DEFENSE(RangerDefenseAction.class.getName());

    private final String value;

    RangerActionConstant(String value) {
        this.value = value;
    }

}

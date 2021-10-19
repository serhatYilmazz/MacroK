package org.macrok.ranger.constant;

import lombok.Getter;
import org.macrok.ranger.RangerAttackAction;
import org.macrok.ranger.RangerDefenseAction;

@Getter
public enum RangerActionConstant {
    ATTACK(RangerAttackAction.class.getName()),
    DEFENSE(RangerDefenseAction.class.getName());

    private final String value;

    RangerActionConstant(String value) {
        this.value = value;
    }

}

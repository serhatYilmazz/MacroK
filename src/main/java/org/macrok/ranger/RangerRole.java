package org.macrok.ranger;

import lombok.RequiredArgsConstructor;
import org.macrok.action.AttackAction;
import org.macrok.action.DefenseAction;
import org.macrok.role.Role;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public abstract class RangerRole implements Role {

    private final RangerAttackAction rangerAttackAction;

    private final RangerDefenseAction rangerDefenseAction;

    @Override
    public String getRoleName() {
        return "Ranger";
    }

    @Override
    public AttackAction getAttackAction() {
        return rangerAttackAction;
    }

    @Override
    public DefenseAction getDefenseAction() {
        return rangerDefenseAction;
    }
}

package org.macrok.ranger;

import lombok.RequiredArgsConstructor;
import org.macrok.action.Action;
import org.macrok.action.AttackAction;
import org.macrok.action.DefenseAction;
import org.macrok.ranger.constant.RangerActionConstant;
import org.macrok.role.Role;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class RangerRole implements Role {

    private final Map<String, RangerAction> rangerActionsMap;

    @Override
    public String getRoleName() {
        return "Ranger";
    }

    @Override
    public AttackAction getAttackAction() {
        return (AttackAction) rangerActionsMap.get(RangerActionConstant.ATTACK.getValue());
    }

    @Override
    public DefenseAction getDefenseAction() {
        return (DefenseAction) rangerActionsMap.get(RangerActionConstant.DEFENSE.getValue());
    }

    @Override
    public Collection<? extends Action> getActions() {
        return rangerActionsMap.values()
                .stream()
                .map(a -> (Action) a)
                .collect(Collectors.toList());
    }

}

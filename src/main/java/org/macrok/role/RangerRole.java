package org.macrok.role;

import lombok.RequiredArgsConstructor;
import org.macrok.action.Action;
import org.macrok.action.ranger.RangerAction;
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
    public Collection<? extends Action> getActions() {
        return rangerActionsMap.values()
                .stream()
                .map(a -> (Action) a)
                .collect(Collectors.toList());
    }

}

package org.macrok.role;

import lombok.RequiredArgsConstructor;
import org.macrok.action.Action;
import org.macrok.action.priest.PriestAction;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class PriestRole implements Role {

    private final Map<String, PriestAction> priestActionsMap;

    @Override
    public String getRoleName() {
        return "Priest";
    }

    @Override
    public Collection<? extends Action> getActions() {
        return priestActionsMap.values()
                .stream()
                .map(a -> (Action) a)
                .collect(Collectors.toList());
    }

}

package org.macrok.role;

import org.macrok.action.Action;

import java.util.Collection;

public interface Role {
    Collection<? extends Action> getActions();
    String getRoleName();
}

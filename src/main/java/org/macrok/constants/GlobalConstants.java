package org.macrok.constants;

import lombok.Getter;

@Getter
public enum GlobalConstants {
    INITIAL_DELAY(15000L);

    final Long delay;

    GlobalConstants(Long delay) {
        this.delay = delay;
    }
}

package com.demo.features.refactor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Account {
    DEFAULT("mngr480372", "pUtunum");

    private final String name;
    private final String password;
}

package com.housing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InputUserName implements Task {
    String userName;

    public InputUserName(String userName) {
        this.userName = userName;
    }

    public static InputUserName with(String userName) {
        return instrumented(InputUserName.class, userName);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Enter.theValue(userName).into(By.name("uid"))
        );
    }


}

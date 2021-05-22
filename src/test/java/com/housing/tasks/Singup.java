package com.housing.tasks;

import com.housing.ui.HomePages;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Singup implements Task {
    String email;

    public Singup(String email) {
        this.email = email;
    }

    public static Performable withEmail(String email) {
        return Tasks.instrumented(Singup.class, email);
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        t.wasAbleTo(
                Enter.theValue(email).into(HomePages.TXT_EMAILS).then(
                        Click.on(HomePages.BTN_SINGUP)
                )
        );
    }
}

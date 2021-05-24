package com.housing.tasks;

import com.housing.ui.HomePages;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

public class SingupEnsure implements Task {
    String value;

    public SingupEnsure(String value) {
        this.value = value;
    }

    public static Performable withEmail(String value) {
        return Tasks.instrumented(SingupEnsure.class, value);
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        t.wasAbleTo(
                Enter.theValue(value).into(HomePages.TXT_EMAILS).
                        then(
                                Click.
                                        on(HomePages.BTN_SINGUP)
                        )
        );

        Ensure.that(HomePages.TXT_EMAILS.resolveFor(t).getAttribute("value")).isEqualTo(value);
    }
}

package com.housing.tasks;

import com.housing.ui.HomePages;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class TimKiem implements Task {
    private final String value;

    public TimKiem(String value) {
        this.value = value;
    }

    public static Performable tukhoa(String value) {
        return Tasks.instrumented(TimKiem.class, value);
    }

    @Override
    public <T extends Actor> void performAs(T t) {

        t.wasAbleTo(Enter.theValue(value).into(HomePages.TXT_SEARCH).thenHit(Keys.ENTER));
    }
}

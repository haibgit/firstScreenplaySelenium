package com.housing.tasks;

import com.housing.ui.HomePages;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class Search implements Task {
    private final String value;

    /*
    đoạn này khởi tạo contructor để khởi tạo dc value , lấy value đó truyền vào chỗ performAs
     */
    public Search(String value) {
        this.value = value;
    }

    public static Performable withValue(String value) {
        return Tasks.instrumented(Search.class, value);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
//        actor.wasAbleTo(EnterValue new EnterValueIntoTarget(SearchBox.TXT_SEARCH, value).thenHit(Keys.ENTER));
        actor.wasAbleTo(
                Enter.
                        theValue(value)
                        .into(HomePages.TXT_SEARCH)
                        .thenHit(Keys.ENTER)
        );
    }


}

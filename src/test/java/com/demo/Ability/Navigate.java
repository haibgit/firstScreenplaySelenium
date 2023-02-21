package com.demo.Ability;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class Navigate {
    public static Performable toTheHomePage() {
        return Task.where("{0} go to the home page",
                Open.url("https://demo.guru99.com/V4/")

        );
    }
}

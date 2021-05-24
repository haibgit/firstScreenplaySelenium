package com.housing.question;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("verify the displayed username")
public class TheEmail_PageObject implements Question<String> {
    public static Question<String> value() {
        return new TheEmail_PageObject();
    }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(By.id("user_email")).getAttribute("value");
    }
}

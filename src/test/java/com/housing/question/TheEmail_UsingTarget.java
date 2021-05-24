package com.housing.question;

import com.housing.ui.HomePages;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheEmail_UsingTarget implements Question<String> {

    public static Question<String> display() {
        return new TheEmail_UsingTarget();
    }

    @Override
    public String answeredBy(Actor actor) {

        String value = HomePages.TXT_EMAILS.resolveFor(actor).getAttribute("value");

        System.out.println("->>>>>>" + value);
        return value;
    }
}

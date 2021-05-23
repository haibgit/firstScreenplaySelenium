package com.housing.question;

import com.housing.ui.HomePages;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.targets.TheTarget;

public class TheEmailItem implements Question<String> {

    public static Question<String> display() {
        return new TheEmailItem();
    }

    @Override
    public String answeredBy(Actor actor) {
//        String value = TheTarget.valueOf(HomePages.TXT_EMAILS)..answeredBy(actor);
//                TheTarget.
//        String value = Attribute.of(HomePages.TXT_EMAILS).named("value").toString();


        String value = HomePages.TXT_EMAILS.resolveFor(actor).getAttribute("value");

        System.out.println("->>>>>>" + value);
        return value;
    }
}

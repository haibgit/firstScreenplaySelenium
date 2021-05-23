package com.housing.question;

import com.housing.ui.HomePages;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheHeaderTitle implements Question<String> {
    public static Question<String> display() {
        return new TheEmailItem();
    }

    @Override
    public String answeredBy(Actor actor) {
        String value = Text.of(HomePages.LBL_HEADER)
                .viewedBy(actor)
                .asString();
        System.out.println("->>>>>>" + value);
        return value;
    }


}

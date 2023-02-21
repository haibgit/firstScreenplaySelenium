package com.demo.question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Home {
    public static Question<String> firstHeading() {
        return Text.of(".heading3");
    }
}

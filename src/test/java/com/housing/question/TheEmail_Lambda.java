package com.housing.question;

import com.housing.ui.HomePages;
import net.serenitybdd.screenplay.Question;

public class TheEmail_Lambda {
    public static Question<String> value() {

        return actor -> HomePages.TXT_EMAILS.resolveFor(actor).getAttribute("value");
    }


}

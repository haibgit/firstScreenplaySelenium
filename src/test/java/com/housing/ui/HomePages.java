package com.housing.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePages {
    public static Target TXT_SEARCH = Target.the("search filed").located(By.name("q"));
    public static Target TXT_EMAILS = Target.the("Email address").located(By.id("user_email"));
    public static Target TXT_USERNAME = Target.the("Email address").located(By.id("user_login"));
    public static Target BTN_SINGUP = Target.the("button singup").locatedBy("//button[normalize-space()='Sign up for GitHub']");
}

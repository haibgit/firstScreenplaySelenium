package com.demo.ui;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target PASSWORD = Target.the("text box password").located(By.name("password"));
    public static final Target BUTTON_LOGIN = Target.the("button login").located(By.name("btnLogin"));
    public static Target USERNAME = Target.the("text box username").located(By.name("uid"));


}

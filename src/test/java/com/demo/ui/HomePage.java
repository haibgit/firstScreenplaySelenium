package com.demo.ui;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static Target HEADING = Target.the("heading of homepage after login").located(By.cssSelector(".heading3"));


}

package com.housing.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchBox {
    public static Target TXT_SEARCH = Target.the("search filed").located(By.name("q"));
}

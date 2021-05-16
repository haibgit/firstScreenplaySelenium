package com.housing.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GithubSearch {

    public static Target SEARCH_GITHUB = Target.the("search github").located(By.name("q"));

}

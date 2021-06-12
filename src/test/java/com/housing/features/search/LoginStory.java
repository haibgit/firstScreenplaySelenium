package com.housing.features.search;

import com.housing.Ability.UserInfo;
import com.housing.tasks.Login;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginStory {

    @Managed()
    public WebDriver hisBrowser;
    Actor hainv = Actor.named("Hainv").whoCan(UserInfo.getInfo());

    @Before
    public void initHisBrowser() {
        hainv.can(BrowseTheWeb.with(hisBrowser));
    }

    @Test
    public void demoLogin() {
        hainv.wasAbleTo(Open.url("http://demo.guru99.com/V1/index.php"));
        hainv.attemptsTo(Login.withInfo());
    }

}

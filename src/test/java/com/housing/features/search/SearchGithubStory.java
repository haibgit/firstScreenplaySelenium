package com.housing.features.search;

import com.housing.tasks.LaunchWebTest;
import com.housing.tasks.Search;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class SearchGithubStory {

    Actor hainv = Actor.named("Hainv");

    @Managed()
    public WebDriver hisBrowser;
    @Steps
    LaunchWebTest launchWebTest;


    @Before
    public void initHisBrowser() {
        hainv.can(BrowseTheWeb.with(hisBrowser));
    }

    @Test
    public void test_first_demo() {
//        hainv.wasAbleTo(Open.url("https://github.com/"));
        hainv.wasAbleTo(launchWebTest);
        hainv.attemptsTo(Search.withValue("selenium"));
    }
}
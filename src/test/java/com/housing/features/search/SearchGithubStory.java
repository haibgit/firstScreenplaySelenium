package com.housing.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchGithubStory {

    Actor hainv = Actor.named("Hainv");

    @Managed()
    public WebDriver hisBrowser;

    @Before
    public void initHisBrowser() {
        hainv.can(BrowseTheWeb.with(hisBrowser));
    }

    @Test
    public void test_first_demo() {

    }
}
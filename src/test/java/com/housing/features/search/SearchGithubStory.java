package com.housing.features.search;

import com.housing.tasks.LaunchWebTest;
import com.housing.tasks.Singup;
import com.housing.tasks.TimKiem;
import com.housing.ui.HomePages;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class SearchGithubStory {

    @Managed()
    public WebDriver hisBrowser;
    Actor hainv = Actor.named("Hainv");
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
        hainv.wasAbleTo(TimKiem.tukhoa("hainv"));
//        hainv.attemptsTo(Search.withValue("selenium"));
        hainv.should(GivenWhenThen.seeThat(TheWebPage.title(), CoreMatchers.containsString("hainv")));
    }

    @Test
    public void test_fill_and_click() {
        hainv.attemptsTo(launchWebTest);
        hainv.wasAbleTo(Singup.withEmail("hainv@gmail.com"));
        hainv.should(GivenWhenThen.seeThat(WebElementQuestion.the(HomePages.TXT_USERNAME),
                WebElementStateMatchers.isVisible()));
    }

}
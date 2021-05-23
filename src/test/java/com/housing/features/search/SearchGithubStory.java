package com.housing.features.search;

import com.housing.question.TheEmailItem;
import com.housing.question.TheHeaderTitle;
import com.housing.tasks.LaunchWebTest;
import com.housing.tasks.Singup;
import com.housing.tasks.TimKiem;
import com.housing.ui.HomePages;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.serenitybdd.screenplay.questions.page.TheWebPage.title;
import static org.hamcrest.CoreMatchers.containsString;


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
        hainv.should(seeThat(
                title(), containsString("hainv")
        ));
    }

    @Test
    public void test_fill_and_click() {
        hainv.attemptsTo(launchWebTest);
        hainv.wasAbleTo(Singup.withEmail("hainv@gmail.com"));
        hainv.should(
                seeThat(
                        the(HomePages.TXT_USERNAME), isVisible()
                )
        );

    }

    @Test
    public void fill_email_and_click_signing() {
        hainv.attemptsTo(launchWebTest);
        hainv.wasAbleTo(Singup.withEmail("hainv@gmail.com"));
        hainv.should(seeThat(TheHeaderTitle.display(), containsString("Create your account")));
    }

    @Test
    public void verify_using_attribute() {
        hainv.attemptsTo(launchWebTest);
        hainv.wasAbleTo(Singup.withEmail("hainv@gmail.com"));
        hainv.should(seeThat(TheEmailItem.display(), containsString("hainv")));
    }

}
package com.housing.features.search;

import com.housing.tasks.OpenGitHub;
import com.housing.tasks.Search;
import com.housing.tasks.SearchGithub;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.containsString;

@RunWith(SerenityRunner.class)
public class SearchGithubStory {

    Actor hainv = Actor.named("Hainv");

    @Managed(uniqueSession = true)
    public WebDriver browser;

    @Steps
    OpenGitHub openGitHub;

    @Before
    public void annaCanBrowseTheWeb() {
        hainv.can(BrowseTheWeb.with(browser));
    }

    @Test
    public void search_results_should_show_the_search_term_in_the_title() {

        givenThat(hainv).wasAbleTo(openGitHub);
        when(hainv).attemptsTo(SearchGithub.forKeyword("haibgit"));
        then(hainv).should(eventually(seeThat(TheWebPage.title(), containsString("haibgit"))));

    }
}
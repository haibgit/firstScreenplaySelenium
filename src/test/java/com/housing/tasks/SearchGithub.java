package com.housing.tasks;

import com.housing.ui.GithubSearch;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import org.yecht.Data;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchGithub implements Task {
    public SearchGithub(String search) {
        this.search = search;
    }

    private String search;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(search).into(GithubSearch.SEARCH_GITHUB).thenHit(Keys.ENTER));
    }

    public static SearchGithub forKeyword(String search) {
        return instrumented(SearchGithub.class, search);
    }
}

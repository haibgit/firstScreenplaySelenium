package com.housing.tasks;

import com.housing.ui.GithubPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenGitHub implements Task {
    GithubPage githubPage;

    @Step("Open the github")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn().the(githubPage));
    }


}

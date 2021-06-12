package com.housing.tasks;

import com.housing.Ability.UserInfo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {
    public static Login withInfo() {
        return instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                InputUserName.with(userInfo(actor).username)

        );
    }

    private <T extends Actor> UserInfo userInfo(T actor) {
        return UserInfo.as(actor);
    }

//    private UserInfo userInfo(Actor actor) {
//        return UserInfo.as(actor);
//    }


}

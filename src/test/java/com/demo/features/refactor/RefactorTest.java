package com.demo.features.refactor;

import com.demo.Ability.Navigate;
import com.demo.tasks.Login;
import com.demo.ui.HomePage;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
public class RefactorTest {

    @CastMember(name = "Refactor Man")
    Actor actor;

    @Test
    void checkWhenLoginValidAccount() {

        actor.attemptsTo(

                Navigate.toTheHomePage(),
                Login.withAccountRefactor("mngr480372", "pUtunum"),
                Ensure.that(Text.of(HomePage.HEADING)).contains("Welcome To Manager's Page of Guru99 Bank"));
    }

}

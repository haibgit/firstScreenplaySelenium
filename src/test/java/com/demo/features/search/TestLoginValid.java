package com.demo.features.search;


import com.demo.Ability.Navigate;
import com.demo.question.Home;
import com.demo.tasks.Login;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
class TestLoginValid {

    @CastMember(name = "Hai")
    Actor hai;

    @Test
    void checkWhenLoginValidAccount() {

        hai.attemptsTo(
                Navigate.toTheHomePage(),
                Login.withAccount("mngr480372", "pUtunum"),
                Ensure.that(Home.firstHeading()).isEqualTo("Welcome To Manager's Page of Guru99 Bank"));
//                Ensure.that(Text.of(Home.HEADING)).contains("Welcome To Manager's Page of Guru99 Bank"));
    }
}

package com.demo.tasks;

import com.demo.features.refactor.Account;
import com.demo.ui.LoginPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;

public class Login {
    public static Performable withAccount(String userName, String password) {
        return Task.where(
                "{0} login with account",
                Enter.theValue(userName).into(By.name("uid")),
                Enter.theValue(password).into(By.name("password")),
                Click.on(By.name("btnLogin"))

        );

    }

    public static Performable withAccountRefactor(Account account) {

        return Task.where(
                "{0} login with account",
                Enter.theValue(account.getName()).into(LoginPage.USERNAME),
                Enter.theValue(account.getPassword()).into(LoginPage.PASSWORD),
                Click.on(LoginPage.BUTTON_LOGIN)

        );
    }
}

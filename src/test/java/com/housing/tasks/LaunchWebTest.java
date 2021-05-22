package com.housing.tasks;

import com.housing.ui.DefaultPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;


public class LaunchWebTest implements Task {

    private DefaultPage defaultPage;

    /*
    1 là nếu thêm steps thì nó sẽ ghi đè steps này vào report
    2. nếu ko ghi thì nó sẽ mặc định show tên actor+ classname. ví dụ hainv Launch Web Test
     */
//    @Step("{0} open web test")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn().the(defaultPage));
    }


}

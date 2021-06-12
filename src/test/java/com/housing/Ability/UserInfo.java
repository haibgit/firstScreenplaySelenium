package com.housing.Ability;

import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class UserInfo implements Ability {
    public String username;
    public String password;

    public UserInfo(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public static UserInfo getInfo() {

        FileReader reader;
        Properties properties = null;
        try {
            reader = new FileReader("src/test/resources/user.properties");
            properties = new Properties();
            properties.load(reader);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new UserInfo(
                properties.getProperty("userName"),
                properties.getProperty("passWord"));

    }

    public static <T extends Actor> UserInfo as(T actor) {
        return actor.abilityTo(UserInfo.class);
    }


//    public static <T extends Actor> UserInfo as(T actor) {
//        return actor.abilityTo(UserInfo.class);
//    }

}

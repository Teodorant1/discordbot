package sample;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Main {

    public static void main(String[] args) throws LoginException {

        JDA bot = JDABuilder.createDefault("token goes here brrrrrr")
                .setActivity(Activity.playing("Teodorantinsanitytopicsimulator.com"))
                .addEventListeners(new reactionlistener())
                .build();
        ;
        System.out.println("Derp");

        System.out.println("herp");

    }
}

package sample;

import net.dv8tion.jda.api.entities.MessageReaction;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.events.sticker.GuildStickerAddedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class reactionlistener extends ListenerAdapter {

    @Override
    public void onMessageReactionAdd(@NotNull MessageReactionAddEvent event) {

        event.getEmoji().getName().toString();

        System.out.println(event.getEmoji().getAsReactionCode().toString());
        System.out.println(event.getEmoji().getName());
        System.out.println(event.getEmoji().getName());
        System.out.println(event.getEmoji().getName());
        System.out.println(event.getEmoji().getName());

        System.out.println(event.getReaction().getEmoji());
        System.out.println(event.getReaction());

        if (event.getChannel().getName().equals("click-for-roles"))
        {
             event.getGuild().addRoleToMember(event.getMember(),event.getGuild().getRolesByName("role2",true).get(0)).complete();
            System.out.println("the if statement is true");
        }
    }



}

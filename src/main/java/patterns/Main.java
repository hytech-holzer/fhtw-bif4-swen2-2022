package patterns;

import patterns.command.*;
import patterns.mediator.ChatParticipant;
import patterns.mediator.ChatRoom;
import patterns.mediator.ChatService;
import patterns.observer.Blog;
import patterns.observer.User;

public class Main {

    public static void main(String[] args) {
        commandDemo();
        observerDemo();
        mediatorDemo();
    }

    private static void mediatorDemo() {
        ChatService mediator = new ChatRoom();

        ChatParticipant user1 = new ChatParticipant(mediator, "user1");
        ChatParticipant user2 = new ChatParticipant(mediator,"user2");
        ChatParticipant user3 = new ChatParticipant(mediator,"user3");
        ChatParticipant user4 = new ChatParticipant(mediator,"user4");

        user1.sendPrivateMessage("user2", "Hello user2");
        user2.sendPublicMessage("Hey all");
    }

    private static void commandDemo() {
        TextFile myTextFile = new TextFile();

        Command openCommand = new OpenCommand(myTextFile);
        openCommand.execute();

        Command printCommand = new PrintCommand(myTextFile);
        printCommand.execute();
    }

    private static void observerDemo() {
        User userA = User.builder().name("holzer").build();
        User userB = User.builder().name("mustermann").build();

        Blog blog = Blog.builder().name("Fasching").build();
        blog.addObserver(userA);
        blog.addObserver(userB);

        blog.notifyObservers("neuer Beitrag!");
    }
}

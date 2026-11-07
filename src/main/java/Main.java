public class Main {

    public static void main(String[] args) {

        YouTubeChannel channel = new YouTubeChannel();

        Observer user1 = new Subscriber("Ali");
        Observer user2 = new Subscriber("Sara");
        Observer user3 = new Subscriber("Reza");

        channel.subscribe(user1);
        channel.subscribe(user2);
        channel.subscribe(user3);

        channel.uploadVideo("Learn Java Observer Pattern");

        System.out.println("----------------");

        channel.unsubscribe(user2);

        channel.uploadVideo("Learn Java Design Patterns");
    }
}

public class Driver {
    public static void main(String[] args) {

        String chat = "Hello everyone\nThis is spam message\nHow are you?\nSpam link here\nHave a nice day";

        System.out.println("Filtered Chat Messages:");

        ChatFilter.filter(chat);
    }
}


public class ChatFilter {

    public static void filter(String chat) {
        String[] messages = chat.split("\n");

        for (String message : messages) {
            if (message.toLowerCase().contains("spam")) {
                continue;
            }

            System.out.println(message);
        }
    }
}

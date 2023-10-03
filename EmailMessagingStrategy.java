public class EmailMessagingStrategy implements MessagingStrategy{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message via email:  " + message);
    }
}

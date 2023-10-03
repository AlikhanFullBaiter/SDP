public class SMSMessagingStrategy implements MessagingStrategy{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message via SMS:  " + message);
    }
}

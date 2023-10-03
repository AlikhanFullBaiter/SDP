public class main {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        configManager.sendMessage("This is email message"); //Sending a message using the default email strategy

        configManager.setMessagingStrategy(new SMSMessagingStrategy());//switching to SMS strategy
        configManager.sendMessage("This is sms message");

        configManager.setMessagingStrategy(new EmailMessagingStrategy());//swithcing back email strategy
        configManager.sendMessage("another email message");
    }
}

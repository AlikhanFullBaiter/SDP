public class ConfigurationManager {
    private static ConfigurationManager instance;

    private MessagingStrategy messagingStrategy;

    private ConfigurationManager() {
        messagingStrategy = new EmailMessagingStrategy();
    }

    public static ConfigurationManager getInstance() {
        if(instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public void setMessagingStrategy(MessagingStrategy strategy) {
        messagingStrategy = strategy;
    }

    public void sendMessage(String message) {
        messagingStrategy.sendMessage(message);
    }
}



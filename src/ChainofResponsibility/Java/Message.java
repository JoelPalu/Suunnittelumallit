public class Message {
    private String message;
    private MessageType messageType;
    private String email;

    public Message(String message, MessageType messageType, String email) {
        this.message = message;
        this.messageType = messageType;
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

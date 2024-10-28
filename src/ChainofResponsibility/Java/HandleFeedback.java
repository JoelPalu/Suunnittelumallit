public class HandleFeedback extends Handler {
    @Override
    public void handle(Message message) {
        if (message.getMessageType() == MessageType.FEEDBACK) {
            System.out.println("Feedback Handler: " + message.getMessage());
        }else{
            this.getNextHandler().handle(message);
        }
    }
}

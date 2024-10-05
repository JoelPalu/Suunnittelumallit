public class HandleSuggestion extends Handler {
    @Override
    public void handle(Message message) {
        if (message.getMessageType() == MessageType.SUGGESTION) {
            System.out.println("Suggestion Handler: " + message.getMessage());
        }else{
            this.getNextHandler().handle(message);
        }


    }
}

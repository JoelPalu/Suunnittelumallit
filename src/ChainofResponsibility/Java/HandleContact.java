public class HandleContact extends Handler {
    @Override
    public void handle(Message message) {
        if (message.getMessageType() == MessageType.CONTACT) {
            System.out.println("Contact Handler: " + message.getMessage());
        }else{
            this.getNextHandler().handle(message);
        }
    }
}

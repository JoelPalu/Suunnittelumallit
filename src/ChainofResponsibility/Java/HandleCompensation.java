public class HandleCompensation extends Handler {
    @Override
    public void handle(Message message) {
        if (message.getMessageType() == MessageType.COMPENSATION) {
            System.out.println("Compensation Handler: " + message.getMessage());
        }else{
            this.getNextHandler().handle(message);
        }
    }
}

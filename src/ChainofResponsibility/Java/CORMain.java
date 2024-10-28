public class CORMain {
    public static void main(String[] args) {
        Handler handleFeedback = new HandleFeedback();
        Handler handleSuggestion = new HandleSuggestion();
        Handler handleContact = new HandleContact();
        Handler handleCompensation = new HandleCompensation();

        handleFeedback.setNextHandler(handleSuggestion);
        handleSuggestion.setNextHandler(handleContact);
        handleContact.setNextHandler(handleCompensation);
        handleCompensation.setNextHandler(handleFeedback);

        Message message1 = new Message("This is a feedback message", MessageType.FEEDBACK, "pepe@yepcock.com");
        Message message2 = new Message("This is a suggestion message", MessageType.SUGGESTION, "F@FS.com");
        Message message3 = new Message("This is a contact message", MessageType.CONTACT, "asdasdasd@mas.com");

        handleFeedback.handle(message1);
        handleFeedback.handle(message2);
        handleFeedback.handle(message3);


    }


}

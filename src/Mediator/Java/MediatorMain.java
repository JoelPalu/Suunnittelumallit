import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MediatorMain extends Application {
    private ChatMediator mediator = new ChatMediatorImpl();

    @Override
    public void start(Stage primaryStage) {
        createClientWindow("User1");
        createClientWindow("User2");
        createClientWindow("User3");
    }

    private void createClientWindow(String username) {
        Stage stage = new Stage();
        stage.setTitle(username);

        TextArea messageArea = new TextArea();
        messageArea.setEditable(false);

        TextField messageField = new TextField();
        TextField recipientField = new TextField();
        recipientField.setPromptText("Recipient");

        Button sendButton = new Button("Send");
        sendButton.setOnAction(e -> {
            String message = messageField.getText();
            String recipient = recipientField.getText();
            if (!message.isEmpty() && !recipient.isEmpty()) {
                ChatClient client = new ChatClient(username, mediator, messageArea);
                client.sendMessage(message, recipient);
                messageField.clear();
            }
        });

        VBox layout = new VBox(10, new Label("Chat:"), messageArea, new Label("Recipient:"), recipientField, new Label("Message:"), messageField, sendButton);
        Scene scene = new Scene(layout, 300, 400);
        stage.setScene(scene);
        stage.show();
    }

}
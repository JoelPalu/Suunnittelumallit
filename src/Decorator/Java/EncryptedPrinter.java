import java.util.Base64;

public class EncryptedPrinter implements Printer {
    private final Printer printer;

    public EncryptedPrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String text) {
        String encryptedText = Base64.getEncoder().encodeToString(text.getBytes());
        printer.print(encryptedText);
    }

}

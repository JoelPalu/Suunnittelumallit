import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FilePrinter implements Printer {

    private final Printer printer;
    private String fileName = "output.txt";

    public FilePrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String text) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            writer.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
        printer.print(text);
    }
}

public class DecoratorMain {
    public static void main(String[] args) {
        Printer basicPrinter = new BasicPrinter();
        basicPrinter.print("Hello World!");

        Printer decoratedPrinter = new FilePrinter(new EncryptedPrinter(new BasicPrinter()));
        decoratedPrinter.print("Hello World!");
    }
}
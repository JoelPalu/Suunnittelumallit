public class DecoratorMain {
    public static void main(String[] args) {
        Printer basicPrinter = new BasicPrinter();
        basicPrinter.print("Hello World!");

        Printer decoratedPrinter = new EncryptedPrinter(new FilePrinter(new BasicPrinter()));
        decoratedPrinter.print("Hello World!");
    }
}
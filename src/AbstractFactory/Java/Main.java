public class Main {
    public static void main(String[] args) {
        UiFactory factory = new WinFactory();
        factory.setElement("Button");
        factory.displayElement();

        factory.setElement("CheckBox");
        factory.displayElement();

        factory.setElement("TextField");
        factory.displayElement();

        factory = new MacFactory();
        factory.setElement("Button");
        factory.displayElement();

        factory.setElement("CheckBox");
        factory.displayElement();

        factory.setElement("TextField");
        factory.displayElement();
    }
}

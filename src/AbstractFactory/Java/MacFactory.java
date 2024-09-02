public class MacFactory extends UiFactory {

    @Override
    public void createButton() {
        new MacButton().display();

    }

    @Override
    public void createCheckBox() {
        new MacCheckBox().display();

    }

    @Override
    public void createTextField() {
        new MacTextField().display();
    }
}

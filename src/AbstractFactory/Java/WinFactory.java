public class WinFactory extends UiFactory {


    @Override
    public void createButton() {
        new WinButton().display();

    }

    @Override
    public void createCheckBox() {
        new WinCheckBox().display();

    }

    @Override
    public void createTextField() {
        new WinTextField().display();
    }
}

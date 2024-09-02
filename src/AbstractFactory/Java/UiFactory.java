public abstract class UiFactory {

    String element = "";

    public void setElement(String element){
        this.element = element;
    }

    public void displayElement(){
        switch (element) {
            case "Button":
                createButton();
                break;
            case "CheckBox":
                createCheckBox();
                break;
            case "TextField":
                createTextField();
                break;
            default:
                System.out.println("Element not found");
                break;
        }
    }

    public abstract void createButton();

    public abstract void createCheckBox();
    public abstract void createTextField();

}

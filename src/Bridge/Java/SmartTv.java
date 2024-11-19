public class SmartTv extends Tv{
    private String browser;

    public void browserInternet(String link){
        this.browser = link;
        System.out.println("Browsing: " + link);

    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm Smart TV.");
        System.out.println("| I'm " + (super.isEnabled() ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + getVolume() + "%");
        System.out.println("| Current channel is " + getChannel());
        if(browser != null){
            System.out.println("| Current browser is " + browser);
        }
        System.out.println("------------------------------------\n");
    }


}

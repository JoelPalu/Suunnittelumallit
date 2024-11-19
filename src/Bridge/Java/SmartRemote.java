public class SmartRemote extends BasicRemote {
    public SmartRemote(Device device) {
        super(device);
    }

    public void voiceControl(String command) {
        System.out.println("Voice control command: " + command);
        if (command.equalsIgnoreCase("browse")) {
            if (device instanceof SmartTv) {
                ((SmartTv) device).browserInternet("http://example.com");
            } else {
                System.out.println("This device does not support browsing.");
            }
        }
    }
}
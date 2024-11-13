public class Computer {
    private String CPU;
    private String GPU;
    private Integer RAM;
    private Integer storage;
    private String OS;

    public Computer () {
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getCPU() {
        return CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public Integer getRAM() {
        return RAM;
    }

    public Integer getStorage() {
        return storage;
    }

    public String getOS() {
        return OS;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", RAM=" + RAM +
                ", storage=" + storage +
                ", OS='" + OS + '\'' +
                '}';
    }



}

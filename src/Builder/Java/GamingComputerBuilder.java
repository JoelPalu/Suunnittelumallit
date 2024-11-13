public class GamingComputerBuilder implements ComputerBuilder {
    private final Computer computer;


    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildCPU() {
        computer.setCPU("i9-14900k");
    }

    @Override
    public void buildGPU() {
        computer.setGPU("RTX 4090");
    }

    @Override
    public void buildRAM() {
        computer.setRAM(128);
    }

    @Override
    public void buildStorage() {
        computer.setStorage(2048);
    }

    @Override
    public void buildOS() {
        computer.setOS("Windows 11 Pro");
    }

    public Computer getComputer() {
        return computer;
    }
}

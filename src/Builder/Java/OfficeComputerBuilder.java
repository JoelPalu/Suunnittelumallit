public class OfficeComputerBuilder implements ComputerBuilder {
    private final Computer computer;

    public OfficeComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildCPU() {
        computer.setCPU("Intel i3-10100");
    }

    @Override
    public void buildGPU() {
        computer.setGPU("Intel UHD Graphics 630");
    }

    @Override
    public void buildRAM() {
        computer.setRAM(8);
    }

    @Override
    public void buildStorage() {
        computer.setStorage(512);
    }

    @Override
    public void buildOS() {
        computer.setOS("Windows 11 Enterprise");
    }

    public Computer getComputer() {
        return computer;
    }
}

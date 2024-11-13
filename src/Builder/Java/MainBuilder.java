public class MainBuilder {

    public static void main(String[] args) {
        ComputerBuilder gamingComputerBuilder = new OfficeComputerBuilder();
        ComputerDirector computerDirector = new ComputerDirector(gamingComputerBuilder);
        computerDirector.buildComputer();
        Computer gamingComputer = gamingComputerBuilder.getComputer();
        System.out.println(gamingComputer.toString());
    }
}

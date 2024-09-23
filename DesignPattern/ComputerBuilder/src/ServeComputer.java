public class ServeComputer extends ComputerBuilder{
    @Override
    public void buildCPU() {
        computer.setCPU("Intel Core CPU");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("Intel Core Memory");
    }

    @Override
    public void buildHardDrive() {
        computer.setHardDrive("Intel Core Hard Drive");
    }

    @Override
    public void buildDisplay() {
        computer.setDisplay("No Display");
    }

    @Override
    public void buildMainframe() {
        computer.setMainframe("Intel Core Mainframe");
    }
}

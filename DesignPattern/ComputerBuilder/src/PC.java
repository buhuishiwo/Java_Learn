public class PC extends ComputerBuilder{
    @Override
    public void buildCPU() {
        computer.setCPU("Intel Core CPU");
    }

    @Override
    public void buildDisplay() {
        computer.setDisplay("4K Display");
    }

    @Override
    public void buildHardDrive() {
        computer.setHardDrive("M.2 Hard Drive");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("32GB Memory");
    }

    @Override
    public void buildMainframe() {
        computer.setMainframe("Mainframe");
    }
}

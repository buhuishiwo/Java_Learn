public class Laptop extends ComputerBuilder{
    @Override
    public void buildCPU() {
        computer.setCPU("AMD Core CPU");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("AMD Core Memory");
    }

    @Override
    public void buildHardDrive() {
        computer.setHardDrive("AMD Core Hard Drive");
    }

    @Override
    public void buildDisplay() {
        computer.setDisplay("AMD Core Display");
    }

    @Override
    public void buildMainframe() {
        computer.setMainframe("AMD Core Mainframe");
    }
}

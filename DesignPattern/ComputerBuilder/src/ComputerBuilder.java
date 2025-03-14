public abstract class ComputerBuilder {
    protected Computer computer = new Computer();
    public abstract void buildCPU();
    public abstract void buildMemory();
    public abstract void buildHardDrive();
    public abstract void buildDisplay();
    public abstract void buildMainframe();

    public Computer getComputer() {
        return computer;
    }
}

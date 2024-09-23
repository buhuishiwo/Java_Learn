public class ComputerDirector {
    private ComputerBuilder computerBuilder;

    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }
    public Computer construct() {
        computerBuilder.buildCPU();
        computerBuilder.buildMemory();
        computerBuilder.buildDisplay();
        computerBuilder.buildHardDrive();
        computerBuilder.buildMainframe();
        return computerBuilder.getComputer();
    }
}

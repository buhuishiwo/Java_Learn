public class Mainframe {
    private Memory memory;
    private CPU cpu;
    private HardDisk hardDisk;
    private OS os;

    public Mainframe() {
        this.memory = new Memory();
        this.cpu = new CPU();
        this.hardDisk = new HardDisk();
        this.os = new OS();
    }

    public void on() {
        System.out.println("Mainframe starting...");
        if (!memory.check()) {
            System.out.println("Memory check failed.");
            return;
        }
        if (!cpu.run()) {
            System.out.println("CPU run failed.");
            return;
        }
        if (!hardDisk.read()) {
            System.out.println("HardDisk read failed.");
            return;
        }
        if (!os.load()) {
            System.out.println("OS load failed.");
            return;
        }
        System.out.println("Mainframe finished.");
    }
}

public class Client {
    public static void main(String[] args) {
        PC pc = new PC();
        ComputerDirector director = new ComputerDirector();
        director.setComputerBuilder(pc);
        Computer computer = director.construct();
        System.out.println(computer.getCPU());
    }
}

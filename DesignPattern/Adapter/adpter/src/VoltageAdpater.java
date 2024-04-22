public class VoltageAdpater extends Voltage220V implements Voltage5V{
    public int output5v(){
        int src = output220v();
        int dst = src / 44;
        return dst;
    }
}

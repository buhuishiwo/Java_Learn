public class Phone {
    public void charging(Voltage5V voltage5V) {
        if(voltage5V.output5v() == 5) {
            System.out.println("电压 5v，可以充电");
        } else {
            System.out.println("充电失败");
        }
    }
}

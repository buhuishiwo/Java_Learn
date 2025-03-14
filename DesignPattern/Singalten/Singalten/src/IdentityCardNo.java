import java.awt.datatransfer.Clipboard;

public class IdentityCardNo {
    private IdentityCardNo(){

    }
    private String no;
    private static IdentityCardNo instance;
    public static IdentityCardNo getInstance(){
        synchronized (IdentityCardNo.class){
            if(instance == null){
                System.out.println("第一次办理身份证");
                instance = new IdentityCardNo();
                instance.setIdentityCardNo("1001200402056011");
            }
            else{
                System.out.println("重复办理身份证");
            }
        }
        return instance;
    }
    private void setIdentityCardNo(String no){
        this.no = no;
    }
    public String getIdentityCardNo(){
        return no;
    }
}

class Client {
    public static void main(String[] args) {
        IdentityCardNo id1;
        IdentityCardNo id2;
        id1 = IdentityCardNo.getInstance();
        id2 = IdentityCardNo.getInstance();
        System.out.println("身份证号码是否一致"+(id1==id2));

        String str1 = id1.getIdentityCardNo();
        String str2 = id2.getIdentityCardNo();
        System.out.println("第一次号码"+str1);
        System.out.println("第二次号码"+str2);
        System.out.println("内容是否相同"+str1.equals(str2));
        System.out.println("是否是同一个对象"+(str1==str2));
    }
}
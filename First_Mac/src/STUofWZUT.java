<<<<<<< HEAD
public class STUofWZUT {
    public String stdName;
    public int age;
    public String stdId;
    private String bankId;

    public STUofWZUT(String stdName, int age, String stdId, String bankId) {
        this.stdName = stdName;
        this.age = age;
        this.stdId = stdId;
        this.bankId = bankId;
    }

    public STUofWZUT(String stdName, int age, String stdId) {
        this.stdName = stdName;
        this.age = age;
        this.stdId = stdId;
    }

    public STUofWZUT(String stdName, int age) {
        this.stdName = stdName;
        this.age = age;
    }

    public STUofWZUT(String stdName) {
        this.stdName = stdName;
    }
    public STUofWZUT() {
        this.age = 10;
    }
    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public void sayHello(String strMessage)
    {
        System.out.println(stdName+" say "+strMessage);
    }

}
=======
public class STUofWZUT {
    public String stdName;
    public int age;
    public String stdId;
    private String bankId;

    public STUofWZUT(String stdName, int age, String stdId, String bankId) {
        this.stdName = stdName;
        this.age = age;
        this.stdId = stdId;
        this.bankId = bankId;
    }

    public STUofWZUT(String stdName, int age, String stdId) {
        this.stdName = stdName;
        this.age = age;
        this.stdId = stdId;
    }

    public STUofWZUT(String stdName, int age) {
        this.stdName = stdName;
        this.age = age;
    }

    public STUofWZUT(String stdName) {
        this.stdName = stdName;
    }
    public STUofWZUT() {
        this.age = 10;
    }
    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public void sayHello(String strMessage)
    {
        System.out.println(stdName+" say "+strMessage);
    }

}
>>>>>>> a5613707a74e9d14e557944f071f76b9d422af2b

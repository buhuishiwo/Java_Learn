public interface AbstractFactory {
    Phone newPhone();
    Pad newPad();
}

interface Phone {
    void show();
}
interface Pad {
    void show();
}
class ApplePhone implements Phone {
    public void show() {
        System.out.println("iPhone");
    }
}
class ApplePad implements Pad {
    public void show() {
        System.out.println("iPad");
    }
}
class XiaomiPhone implements Phone {
    public void show() {
        System.out.println("MiPhone");
    }
}
class XiaomiPad implements Pad {
    public void show() {
        System.out.println("MiPad");
    }
}

class AppleFactory implements AbstractFactory {
    public Phone newPhone() {
        return new ApplePhone();
    }
    public Pad newPad() {
        return new ApplePad();
    }
}

class XiaomiFactory implements AbstractFactory {
    public Phone newPhone() {
        return new XiaomiPhone();
    }
    public Pad newPad() {
        return new XiaomiPad();
    }
}

class Client{
    public static void main(String[] args) {
        XiaomiFactory xiaomifactory = new XiaomiFactory();
        AppleFactory applefactory = new AppleFactory();
        Phone miPhone = xiaomifactory.newPhone();
        miPhone.show();
        Pad miPad = xiaomifactory.newPad();
        miPad.show();
        Phone iPhone = applefactory.newPhone();
        iPhone.show();
        Pad iPad = applefactory.newPad();
        iPad.show();
    }
}

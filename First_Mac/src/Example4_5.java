<<<<<<< HEAD
class Rect {
    double width;
    double height;
    double getArea(){
        double area = width*height;
        return area;
    }
}

class Ladder{
    double above;
    double bottom;
    double height;
    double getArea(){
        return (above+bottom)*height/2;
    }
}

public class Example4_5 {
    public static void main(String[] args) {
        Rect ractangle = new Rect();
        ractangle.width = 109.87;
        ractangle.height = 25.18;
        double area = ractangle.getArea();
        System.out.println("矩形的面积："+area);
        Ladder ladder = new Ladder();
        ladder.above = 10.798;
        ladder.bottom = 156.65;
        ladder.height = 18.12;
        area = ladder.getArea();
        System.out.println("梯形的面积"+area);
    }
}
=======
class Rect {
    double width;
    double height;
    double getArea(){
        double area = width*height;
        return area;
    }
}

class Ladder{
    double above;
    double bottom;
    double height;
    double getArea(){
        return (above+bottom)*height/2;
    }
}

public class Example4_5 {
    public static void main(String[] args) {
        Rect ractangle = new Rect();
        ractangle.width = 109.87;
        ractangle.height = 25.18;
        double area = ractangle.getArea();
        System.out.println("矩形的面积："+area);
        Ladder ladder = new Ladder();
        ladder.above = 10.798;
        ladder.bottom = 156.65;
        ladder.height = 18.12;
        area = ladder.getArea();
        System.out.println("梯形的面积"+area);
    }
}
>>>>>>> a5613707a74e9d14e557944f071f76b9d422af2b

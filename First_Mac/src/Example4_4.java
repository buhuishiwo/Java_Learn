<<<<<<< HEAD
class Point{
    int x,y;
    void setXY(int a,int b)
    {
        x = a;
        y = b;
    }
}

public class Example4_4 {
    public static void main(String[] args) {
        Point p1 = null,p2 = null;
        p1 = new Point();
        p2 = new Point();
        System.out.println("p1的引用："+p1);
        System.out.println("p2的引用："+p2);
        p1.setXY(1111,2222);
        p2.setXY(-111,-222);
        System.out.println("p1的xy坐标："+p1.x+","+p1.y);
        System.out.println("p2的xy坐标："+p2.x+","+p2.y);
        p1 = p2;
        System.out.println("将p2的引用赋给p1后：");
        int address = System.identityHashCode(p1);
        System.out.printf("p1的引用：%x\n",address);
        address = System.identityHashCode(p2);
        System.out.printf("p2的引用：%x\n",address);
        System.out.println("p1的xy坐标："+p1.x+","+p1.y);
        System.out.println("p2的xy坐标："+p2.x+","+p2.y);

    }
}
=======
class Point{
    int x,y;
    void setXY(int a,int b)
    {
        x = a;
        y = b;
    }
}

public class Example4_4 {
    public static void main(String[] args) {
        Point p1 = null,p2 = null;
        p1 = new Point();
        p2 = new Point();
        System.out.println("p1的引用："+p1);
        System.out.println("p2的引用："+p2);
        p1.setXY(1111,2222);
        p2.setXY(-111,-222);
        System.out.println("p1的xy坐标："+p1.x+","+p1.y);
        System.out.println("p2的xy坐标："+p2.x+","+p2.y);
        p1 = p2;
        System.out.println("将p2的引用赋给p1后：");
        int address = System.identityHashCode(p1);
        System.out.printf("p1的引用：%x\n",address);
        address = System.identityHashCode(p2);
        System.out.printf("p2的引用：%x\n",address);
        System.out.println("p1的xy坐标："+p1.x+","+p1.y);
        System.out.println("p2的xy坐标："+p2.x+","+p2.y);

    }
}
>>>>>>> a5613707a74e9d14e557944f071f76b9d422af2b

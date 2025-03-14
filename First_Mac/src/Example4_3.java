<<<<<<< HEAD
class XiyoujiRenwu {
    float height,weight;
    String head,ear;
    void speak(String s)
    {
        head = "歪着头";
        System.out.println(head+"说"+s);
    }
}

public class Example4_3 {
    public static void main(String[] args) {
        XiyoujiRenwu zhubajie,sunwukong;
        zhubajie = new XiyoujiRenwu();
        sunwukong = new XiyoujiRenwu();
        zhubajie.height = 1.802f;
        zhubajie.head = "大头";
        zhubajie.ear = "一双大耳朵";
        sunwukong.height = 1.62f;
        sunwukong.weight = 1000f;
        sunwukong.head = "秀发飘飘";
        sunwukong.speak("草，走，忽略");
        System.out.println("zhubajie的身高："+zhubajie.height);
        System.out.println("zhubajie的头"+zhubajie.head);
        System.out.println("sunwukong的重量："+sunwukong.weight);
        System.out.println("sunwukong的头"+sunwukong.head);
        zhubajie.speak("俺老猪想娶媳妇儿");
        System.out.println("zhubajie的头："+zhubajie.head);
        sunwukong.speak("老孙我重1000斤，我想骗八戒背我");
        System.out.println("sunwukong现在的头："+sunwukong.head);
    }
}
=======
class XiyoujiRenwu {
    float height,weight;
    String head,ear;
    void speak(String s)
    {
        head = "歪着头";
        System.out.println(head+"说"+s);
    }
}

public class Example4_3 {
    public static void main(String[] args) {
        XiyoujiRenwu zhubajie,sunwukong;
        zhubajie = new XiyoujiRenwu();
        sunwukong = new XiyoujiRenwu();
        zhubajie.height = 1.802f;
        zhubajie.head = "大头";
        zhubajie.ear = "一双大耳朵";
        sunwukong.height = 1.62f;
        sunwukong.weight = 1000f;
        sunwukong.head = "秀发飘飘";
        sunwukong.speak("草，走，忽略");
        System.out.println("zhubajie的身高："+zhubajie.height);
        System.out.println("zhubajie的头"+zhubajie.head);
        System.out.println("sunwukong的重量："+sunwukong.weight);
        System.out.println("sunwukong的头"+sunwukong.head);
        zhubajie.speak("俺老猪想娶媳妇儿");
        System.out.println("zhubajie的头："+zhubajie.head);
        sunwukong.speak("老孙我重1000斤，我想骗八戒背我");
        System.out.println("sunwukong现在的头："+sunwukong.head);
    }
}
>>>>>>> a5613707a74e9d14e557944f071f76b9d422af2b

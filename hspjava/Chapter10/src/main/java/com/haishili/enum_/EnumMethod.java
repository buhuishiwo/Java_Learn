package com.haishili.enum_;

//演示 Enum 类各种方法的使用
public class EnumMethod {
    public static void main(String[] args) {
        Season2 season2 = Season2.SUMMER;
        //输出枚举对象的名称
        System.out.println(season2.name());
        //输出该枚举对象的编号，从零开始
        System.out.println(season2.ordinal());
        //values 方法返回Season2[]
        //含有定义的所有枚举对象
        System.out.println(season2.values()[1]);
        //valueOf 返回指定常量名的枚举对象
        System.out.println(season2.valueOf("SPRING"));
        //比较两个枚举对象的编号，返回两个对象相减值
        System.out.println(season2.WINTER.compareTo(season2.SPRING));
    }
}

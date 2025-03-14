package com.haishili;

public class HomeWork01 {
    public static void main(String[] args) {
        try {
            if(args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }

            double n1 = Integer.parseInt(args[0]);
            double n2 = Integer.parseInt(args[1]);
            double cal = cal(n1, n2);
            System.out.println("计算结果是："+cal);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("参数格式不对，需要输入整数");
        } catch (ArithmeticException e) {
            System.out.println("出现了除零的异常");
        }

    }

    public static double cal(double n1,double n2) {
        return n1 / n2;
    }
}

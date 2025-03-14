package com.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LQTSystem {
    public double money;
    public String Name;
    public double sum = 0.0;
    public String detail;
    boolean loop = true;
    Scanner sc = new Scanner(System.in);
    String key = "";
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public void showSystem() {
        do {
            System.out.println("==========零钱通菜单==========");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退出");

            System.out.println("请选择(1-4)");
            key = sc.next();
            double sum = 0;
            switch (key) {
                case "1":
                    System.out.println("1 零钱通明细");
                    System.out.println("----------零钱通明细----------");
                    this.displayDetails();
                    break;
                case "2":
                    this.setIncomDetails();
                    break;
                case "3":
                    this.setOutcomDetails();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误，重新选择");
            }
        }while(loop);
        System.out.println("已退出系统");
    }
    public void setIncomDetails() {
        double myIncome;
        System.out.println("输入金额");
        myIncome = sc.nextDouble();
        if(myIncome>=0)
        {
            money = myIncome;
        }else {
            System.out.println("输入金额错误");
            return;
        }
        sum += money;
        System.out.println("输入商户名称:");
        Name = sc.next();
        detail += "\n"+Name+"\t"+"+"+money+"\t"+sdf.format(new Date())+"\t"+"\t"+sum+"\t";
    }
    public void setOutcomDetails() {
        double myOutcom = 0;
        System.out.println("输入金额");
        myOutcom = sc.nextDouble();
        if(myOutcom>=0 && myOutcom<=sum)
        {
            money = myOutcom;
        }else {
            System.out.println("输入金额错误");
            return;
        }
        sum -= money;
        System.out.print("输入商户名称:");
        Name = sc.next();
        detail += "\n"+Name+"\t"+"-"+money+"\t"+sdf.format(new Date())+"\t"+"\t"+sum+"\t";
    }
    public void exit() {
        loop = false;
    }
    public void displayDetails() {
        System.out.println(this.detail);
    }

}

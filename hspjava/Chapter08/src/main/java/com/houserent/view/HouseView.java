package com.houserent.view;

import com.houserent.domain.House;
import com.houserent.service.HouseService;
import com.houserent.utility.Utility;

/*
* 1.显示界面
* 2.接受用户输入
* 3.调用 HouseService 完成对房屋信息的各种操作
* */
public class HouseView {
    private boolean loop = true;
    private char key = ' ';
    private HouseService houseService = new HouseService(5);

    public void listHouses() {
        if(houseService.list()[0] != null)
        {
            System.out.println("编号\t\t房主\t\t电话\t\t\t\t地址\t\t\t月租\t\t\t状态(未出租/已出租)");
            House[] houses = houseService.list();
            for (int i = 0; i < houses.length; i++) {
                if(houses[i] == null) {
                    break;
                }
                System.out.println(houses[i]);
            }
        }else {
            System.out.println("房屋数据为空,请先添加信息");
            return;
        }

    }

    public void deleteHouse() {
        if(houseService.list()[0] != null) {
            House[] houses = houseService.list();
            System.out.println("输入要删除房屋 ID");
            int id = Utility.readInt();
            if(id != 0) {
                if(houses[id-1] != null) {
                    houseService.delete(id);
                    System.out.println("删除成功");
                }
            }
            else {
                System.out.println("无此房屋信息，重新输入或退出查找（输入-1退出）");
                int flag = Utility.readInt();
                if(flag != -1) {
                    deleteHouse();
                }else{
                    return;
                }
            }
        }else {
            System.out.println("房屋信息为空，请添加信息");
            return;
        }

    }

    public void addHouse() {
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String phone = Utility.readString(11);
        System.out.print("地址：");
        String address = Utility.readString(12);
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("状态：");
        String type = Utility.readString(3);
        House houses = new House(name,phone,address,rent,type);
        if(houseService.add(houses)) {
            System.out.println("添加成功");
        }
    }
    public void updateHouse() {
        if(houseService.list()[0] != null) {
            System.out.println("输入要修改房屋的 ID");
            int id = Utility.readInt();
            if(houseService.search(id) != null) {
                House house = houseService.search(id);
                System.out.println("原始数据");
                System.out.println("编号\t\t房主\t\t电话\t\t\t\t地址\t\t\t月租\t\t\t状态(未出租/已出租)");
                System.out.println(house.toString());
                System.out.print("姓名：");
                house.setOwnername(Utility.readString(8,house.getOwnername()));
                System.out.print("电话：");
                house.setPhonenumber(Utility.readString(11,house.getPhonenumber()));
                System.out.print("地址：");
                house.setAddress(Utility.readString(8,house.getAddress()));
                System.out.print("月租：");
                house.setRent(Utility.readDouble(house.getRent()));
                System.out.print("状态：");
                house.setState(Utility.readString(3,house.getState()));
                houseService.update(house);
            }
            else{
                System.out.println("无此房屋信息,重新输入 ID 或者退出查找(-1)");
                int flag = Utility.readInt();
                if(flag != -1) {
                    deleteHouse();
                }else{
                    return;
                }
            }
        }else {
            System.out.println("房屋数据为空,请先添加信息");
            return;
        }

    }
    public void searchHouse() {
        if(houseService.list()[0] != null) {
            System.out.println("输入要查找的房屋 ID");
            int id = Utility.readInt();
            if(houseService.search(id) != null) {
                System.out.println(houseService.search(id));
            }
            else {
                System.out.println("无此房屋信息,重新输入 ID 或退出查找(-1)");
                int flag = Utility.readInt();
                if(flag != -1) {
                    deleteHouse();
                }else{
                    return;
                }
            }
        }else {
            System.out.println("房屋信息为空，请添加信息");
        }

    }
    public void mainMenu() {
        do{
            System.out.println("----------房屋出租系统----------");
            System.out.println("\t\t1 新  增  房 源");
            System.out.println("\t\t2 查 找 房 屋");
            System.out.println("\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t5 房 屋 列 表");
            System.out.println("\t\t6 退      出");
            System.out.println("输入对应数字进入页面");
            key = Utility.readChar();
            switch (key){
                case '1':
                    System.out.println("----------新 增 房 源----------");
                    addHouse();
                    break;
                case '2':
                    System.out.println("----------查 找 房 源----------");
                    searchHouse();
                    break;
                case '3':
                    System.out.println("----------删 除 房 屋 信 息----------");
                    deleteHouse();
                    break;
                case '4':
                    System.out.println("----------修 改 房 屋 信 息----------");
                    updateHouse();
                    break;
                case '5':
                    System.out.println("----------房 屋 列 表----------");
                    listHouses();
                    break;
                case '6':
                    loop = false;
                    break;
                default:
                    System.out.println("输入了错误的数字");
            }
        }while(loop);
        System.out.println("您已退出系统！");

    }
}

package com.houserent.service;

import com.houserent.domain.House;

public class HouseService {
    private House[] houses;
    private int id = 0;
    private int size = 0;
    public HouseService(int size) {
        houses = new House[size];
//        houses[0] = new House(1,"王五","13487876565","北京昌平",5000,"未出租");
    }
    public boolean add(House house) {
        if(houses.length == size) {
            System.out.println("房屋信息已满，无法添加");
            return false;
        }
        houses[size++] = house;
        house.setId(++id);
        return true;
    }
    public void delete(int id) {
        for(int i = id-1; i < size-1; i++) {
            houses[i] = houses[i+1];
        }
        this.id = 0;
        for(int i = 0; i < size-1; i++) {
            houses[i].setId(++this.id);
        }
        houses[--size] = null;
    }
    public House search(int id) {
        for(House house : houses) {
            if (house.getId() == id) {
                return house;
            }
        }
        return null;
    }
    public void update(House house) {
        houses[house.getId()-1] = house;
    }
    public House[] list() {
        return houses;
    }

}

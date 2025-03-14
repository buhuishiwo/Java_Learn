package com.test01;

class Fish {
    int weight = 1;
}
class Lake{
    Fish fish;

    public void setFish(Fish fish) {
        this.fish = fish;
    }
    void foodFish(int m)
    {
        fish.weight = fish.weight+m;
    }

}
public class E {
    public static void main(String[] args) {
        Fish redfish = new Fish();
        System.out.println(redfish.weight);
        Lake lake = new Lake();
        lake.setFish(redfish);
        lake.foodFish(120);
        System.out.println(redfish.weight);
        System.out.println(lake.fish.weight);
    }
}
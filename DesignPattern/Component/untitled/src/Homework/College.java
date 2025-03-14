package Homework;

import java.util.ArrayList;
import java.util.List;

public class College extends Organization {
    List<Organization> organizations = new ArrayList<>();
    public College(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void add(Organization organization) {
        organizations.add(organization);
    }

    public void remove(Organization organization) {
        organizations.remove(organization);
    }

    public void display(){
        System.out.println("++++++++++"+getName()+"++++++++++");
        for(Organization organization : organizations){
            organization.display();
        }
    }
}

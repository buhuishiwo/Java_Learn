package Homework;

import java.util.ArrayList;
import java.util.List;

public class University extends Organization {
    List<Organization> organizations = new ArrayList<>();

    public University(String name) {
        super(name);
    }
    public void add(Organization organization) {
        organizations.add(organization);
    }
    public void remove(Organization organization) {
        organizations.remove(organization);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void display() {
        System.out.println("--------------"+getName()+"--------------");
        for (Organization organization : organizations) {
            organization.display();
        }
    }
}

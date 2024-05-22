package Homework;

public abstract class Organization {

    protected void add(Organization organization) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    protected void remove(Organization organization) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    protected abstract void display();

    public Organization(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;


}

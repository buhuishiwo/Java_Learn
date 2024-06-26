public abstract class OrganizationComponent {

    private String name;
    private String des;
    protected void add(OrganizationComponent organizationComponent) {
        //默认实现,如果默认方法失败，扔出异常
        throw new UnsupportedOperationException();

    }
    protected void remove(OrganizationComponent organizationComponent) {
        //默认实现,如果默认方法失败，扔出异常
        throw new UnsupportedOperationException();

    }
    //构造器
    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    protected abstract void print();
}

public class Client {
    public static void main(String[] args) {
        //从大到小创建对象
        OrganizationComponent university = new University("温州理工","diao");
        OrganizationComponent college1 = new College("计算机学院","计算机学院");
        OrganizationComponent college2 = new College("信息工程学院","信息工程学院");

        college1.add(new Department("计科","四九年入国军"));
        college1.add(new Department("软件工程","好啊"));
        university.add(college1);
        university.add(college2);
        university.print();
    }
}

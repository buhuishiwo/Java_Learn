package Homework;

public class Client {
    public static void main(String[] args) {
        University wzlg = new University("温州理工学院");
        College Ai = new College("数据科学与人工智能学院");
        College Art = new College("设计艺术学院");
        College Eco = new College("经济与管理学院");
        College SLF = new College("外国语学院");
        Department ComputerScience = new Department("计算机科学与技术");
        Department SE = new Department("软件工程");
        Department Engilsh = new Department("英语");
        Department pmsj = new Department("平面设计");
        wzlg.add(Ai);
        wzlg.add(Art);
        wzlg.add(Eco);
        wzlg.add(SLF);
        SLF.add(Engilsh);
        Art.add(pmsj);
        Ai.add(ComputerScience);
        Ai.add(SE);
        wzlg.display();
    }
}

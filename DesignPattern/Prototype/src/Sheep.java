public class Sheep implements Cloneable{

    public Sheep(String name, int age, String color) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }



    public int getAge() {
        return age;
    }



    public String getColor() {
        return color;
    }


    public String toString(){
        return "Sheep [name = "+ name+",age = "+ age+",color = "+color+"]";
    }
    private String name;
    private int age;
    private String color;

    //使用默认的clone方法
    @Override
    protected Object clone()  {
        Sheep sheep = null;
        try {
            sheep = (Sheep)super.clone();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}

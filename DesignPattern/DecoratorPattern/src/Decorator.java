public class Decorator extends Drink{
    private Drink obj;
    //组合
    public Decorator(Drink obj){
        this.obj = obj;
    }
    @Override
    public float cost() {
        //自己的价格
        return super.getPrice()+obj.cost();
    }

    @Override
    public String getDes() {
        return super.des+" "+obj.getDes()+" "+" "+obj.getPrice()+" "+getPrice();
    }
}

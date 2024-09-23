public class VarParameter {
    public static void main(String[] args) {
        Method_VarParameter method_VarParameter = new Method_VarParameter();
        System.out.println(method_VarParameter.add(1,2,3,4,5,6,7,8,9,10));
    }
}

class Method_VarParameter {
    //可变参数被视为数组被传入方法
    public int add (int... num){
        int sum = 0;
        for (int i = 0; i < num.length; i++){
            sum = sum + num[i];
        }
        return sum;
    }
}

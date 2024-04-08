package DeepClone;

public class Client {
    public static void main(String[] args) throws Exception{
        DeepProtoType p = new DeepProtoType();
        p.name = "吴用";
        p.deepCloneableTarget = new DeepCloneableTarget("宋江","及时雨");

        //方式 1 完成深拷贝
        DeepProtoType p2 = (DeepProtoType) p.clone();
        //对比哈希值的不同，可知克隆成功
        System.out.println(p.name+p.deepCloneableTarget.hashCode());
        System.out.println(p2.name+p2.deepCloneableTarget.hashCode());

        DeepProtoType p3 = (DeepProtoType) p.deepClone();
        System.out.println(p3.name+p3.deepCloneableTarget.hashCode());
    }
}

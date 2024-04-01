package DeepClone;

import java.io.Serializable;

public class DeepProtoType implements Serializable, Cloneable {
    public String name;
    public DeepCloneableTarget deepCloneableTarget;
    public DeepProtoType() {
        super();
    }

    //方法 1 深拷贝
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //对基本数据类型的克隆
        deep = super.clone();
        //对引用类型的属性，进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType)deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget)deepCloneableTarget.clone();
        return deepProtoType;
    }
}

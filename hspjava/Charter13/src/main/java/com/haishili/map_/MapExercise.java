package com.haishili.map_;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class MapExercise {
    public static void main(String[] args) {
        HashMap<String, Empolyee> map = new HashMap<>();
        map.put("1",new Empolyee("1","jack",19000));
        map.put("2",new Empolyee("2","jack",13000));
        map.put("3",new Empolyee("3","jack",15000));

        Set<String> strings = map.keySet();
        for (String string : strings) {
            if(map.get(string).getSal()>18000)
            {
                System.out.println(string+":"+map.get(string));
            }
        }
        Set<Map.Entry<String, Empolyee>> entries = map.entrySet();
        for (Map.Entry<String, Empolyee> entry : entries) {
            if(entry.getValue().getSal()>18000) {
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }
    }
}

class Empolyee {
    private String id;
    private String name;
    private double sal;
    public Empolyee(String id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empolyee empolyee = (Empolyee) o;
        return id == empolyee.id && Double.compare(sal, empolyee.sal) == 0 && Objects.equals(name, empolyee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sal);
    }

    @Override
    public String toString() {
        return "Empolyee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}
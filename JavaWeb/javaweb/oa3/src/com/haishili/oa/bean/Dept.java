package com.haishili.oa.bean;

import java.util.Objects;

public class Dept {
    String deptName;
    String deptNo;
    String deptLoc;

    public Dept(){

    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptLoc() {
        return deptLoc;
    }

    public void setDeptLoc(String deptLoc) {
        this.deptLoc = deptLoc;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dept dept = (Dept) o;
        return Objects.equals(deptName, dept.deptName) && Objects.equals(deptNo, dept.deptNo) && Objects.equals(deptLoc, dept.deptLoc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deptName, deptNo, deptLoc);
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptName='" + deptName + '\'' +
                ", deptNo=" + deptNo +
                ", deptLoc='" + deptLoc + '\'' +
                '}';
    }
}

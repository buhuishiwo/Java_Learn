package com.haishili.interface_;

public class InterfacePoly {
    public static void main(String[] args) {
        IF if_ = new Teacher();
    }
}

interface IG {}
interface IF extends IG {}
class Teacher implements IF {

}
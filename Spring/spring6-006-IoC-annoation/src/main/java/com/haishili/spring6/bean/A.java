package com.haishili.spring6.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class A {
    public A() {
        System.out.println("A");
    }
}
@Component
class B {

    public B() {
        System.out.println("B");
    }
}
@Service
class C {
    public C() {
        System.out.println("C");
    }
}
@Controller
class D {
    public D() {
        System.out.println("D");
    }
}
@Repository
class E {
    public E() {
        System.out.println("E");
    }
}

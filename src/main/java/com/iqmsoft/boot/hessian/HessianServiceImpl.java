package com.iqmsoft.boot.hessian;

import org.springframework.stereotype.Service;

@Service("hessianService")
public class HessianServiceImpl implements HessianService {

   
    public String sayHello(){
        return "Hessian World";
    }

    public Foo foo() {
        return new Foo("foo");
    }
}

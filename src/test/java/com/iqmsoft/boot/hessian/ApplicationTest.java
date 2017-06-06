package com.iqmsoft.boot.hessian;

import static org.assertj.core.api.BDDAssertions.then;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



import com.iqmsoft.boot.hessian.Foo;
import com.iqmsoft.boot.hessian.HessianService;

@IntegrationTest
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApplicationTest {

    @Autowired
    private HessianService hessianClient;

    @Test
    public void shouldSayHello() {

        //when
        String message = hessianClient.sayHello();

        then(message)
                .isNotEmpty()
                .isEqualTo("Hessian World");
    }

    @Test
    public void shouldReceiveFoo() {

        //when
        Foo foo = hessianClient.foo();

        then(foo.getName())
                .isEqualTo("foo");
    }

}

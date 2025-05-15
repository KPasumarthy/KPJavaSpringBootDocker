package com.kpjavaspringboot.interview;

import net.bytebuddy.build.Plugin;
//import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Test;

@SpringBootTest
public class KPTest {

    private Object priority;

    @Test
    void test1() {
        System.out.println("KP : KPJavaSpringBootApplicationTests : test1()");
    }

    @Test(priority = 2)
       void test2() {
        System.out.println("KP : KPJavaSpringBootApplicationTests : test2()");
    }

    @Test(priority=1)
    void test3() {
        System.out.println("KP : KPJavaSpringBootApplicationTests : test3()");
    }

    @Test
    void test4() {
        System.out.println("KP : KPJavaSpringBootApplicationTests : test4()");
    }

}

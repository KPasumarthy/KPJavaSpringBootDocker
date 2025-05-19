package com.kpjavaspringboot.interview;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Test;

@SpringBootTest
public class KPFibonacciTest {

    private Object priority;

    @Test
    void test0CreateFibonacciSeries() {
        System.out.println("KP : KPJavaSpringBootApplicationTests : test0CreateFibonacciSeries()");
        String[] args = null;
        KPFibonacci.main(args);
    }


    @Test
    void test1CreateFibonacciSeries() {
        System.out.println("KP : KPJavaSpringBootApplicationTests : test1CreateFibonacciSeries() : priority=" + priority);
        KPFibonacci.createFibonacciSeries();
    }

    @Test(priority = 2)
    void test2CreateFibonacciNSeries() {
        System.out.println("KP : KPJavaSpringBootApplicationTests : test2CreateFibonacciNSeries() : priority=" + priority);
        int n = 20;
        KPFibonacci.createFibonacciNSeries(n);
    }

    @Test(priority=1)
    void test3CreateFibonacciNSeries() {
        System.out.println("KP : KPJavaSpringBootApplicationTests : test3CreateFibonacciNSeries() : priority=" + priority);
        int n = 100;
        KPFibonacci.createFibonacciNSeries(n);
    }

    @Test
    void test4CreateFibonacciNSeriesAsDouble() {
        System.out.println("KP : KPJavaSpringBootApplicationTests : test3CreateFibonacciNSeries()");
        double n = 100;
        KPFibonacci.createFibonacciNSeriesAsDouble(n);
    }
}

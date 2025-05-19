package com.kpjavaspringboot.interview;


import com.kpjavaspringboot.KpjavaspringbootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

public class KPFibonacci {

    private static Logger logger = LoggerFactory.getLogger(KpjavaspringbootApplication.class);


    public static void main(String[] args) {

        // KP : Debug Print
        logger.info("KP : KPJavaSpringBootApplication : main() : " + LocalDateTime.now());
        System.out.println("KP : KPMain - com.kpjavaspringboot : main() : " + LocalDateTime.now());
        System.out.println("KP : KPMain - Fiserv Interview : " + LocalDateTime.now());

        /// KP : Fibonacci N=20
        //createFibonacciSeries();

        /// KP : Fibonacci N=20
        int n = 20;
        createFibonacciNSeries(n);

        /// KP : Fibonacci N=100
        n = 100;
        createFibonacciNSeries(n);

        /// KP : Fibonacci N=100
        double nAsDouble = 100;
        createFibonacciNSeriesAsDouble(nAsDouble);


    }
                /// KP : Fibonacci N=20
    public static void createFibonacciSeries(){
        ////KP : Print fibonacci
        int[] Fibonassi = {1, 1, 2, 3,  5, 8, 13, 21};
        System.out.print("KP : KPMain - com.kpjavaspringboot : main() :  Fibonacci Series  = [ " );
        int n = 20;
        int  first=0, second = 1;
        //double n = 1000;
        //double  first= (double) 0, second = (double) 1;

        for (int i = 1; i < n ; ++i) {

            int next = first + second;
            //double next = first + second;
            first = second;
            second = next;

            //System.out.println("KP : KPMain - com.kpjavaspringboot : main() :  first  = " + first + " second  = " + second + " next = " + next);
            //System.out.println("KP : KPMain - com.kpjavaspringboot : main() :  first  = " + first );
            System.out.print(" " + first + ", ");

        }
        System.out.println( " ]" );
    }


        /// KP : Fibonacci N=20
        public static void createFibonacciNSeries(int n){
            ////KP : Print fibonacci
            //int[] Fibonassi = {1, 1, 2, 3,  5, 8, 13, 21};
            System.out.print("KP : KPMain - com.kpjavaspringboot : main() :  Fibonacci (int) N = " + n + " Series  = [ " );
            //int n = 20;
            int  first=0, second = 1;
            //double n = 1000;
            //double  first= (double) 0, second = (double) 1;

            for (int i = 1; i < n ; ++i) {

                int next = first + second;
                //double next = first + second;
                first = second;
                second = next;

                //System.out.println("KP : KPMain - com.kpjavaspringboot : main() :  first  = " + first + " second  = " + second + " next = " + next);
                //System.out.println("KP : KPMain - com.kpjavaspringboot : main() :  first  = " + first );
                System.out.print(" " + first + ", ");

            }
            System.out.println( " ]" );
        }

    /// KP : Fibonacci N=100
    public static void createFibonacciNSeriesAsDouble(double n){
        ////KP : Print fibonacci
        //int[] Fibonassi = {1, 1, 2, 3,  5, 8, 13, 21};
        System.out.print("KP : KPMain - com.kpjavaspringboot : main() :  Fibonacci (double) N = " + n + " Series  = [ " );
        //int n = 20;
        //int  first=0, second = 1;
        //double n = 1000;
        double  first= (double) 0, second = (double) 1;

        for (int i = 1; i < n ; ++i) {

            //int next = first + second;
            double next = first + second;
            first = second;
            second = next;

            //System.out.println("KP : KPMain - com.kpjavaspringboot : main() :  first  = " + first + " second  = " + second + " next = " + next);
            //System.out.println("KP : KPMain - com.kpjavaspringboot : main() :  first  = " + first );
            System.out.print(" " + first + ", ");

        }
        System.out.println( " ]" );
    }





}

package com.kpjavaspringboot.interview;


import com.kpjavaspringboot.KpjavaspringbootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

public class KPMain {

    private static Logger logger = LoggerFactory.getLogger(KpjavaspringbootApplication.class);

    public static void main(String[] args) {

        // KP : Debug Print
        logger.info("KP : KPJavaSpringBootApplication : main() : " + LocalDateTime.now());
        System.out.println("KP : KPMain - com.kpjavaspringboot : main() : " + LocalDateTime.now());
        System.out.println("KP : KPMain - Fiserv Interview : " + LocalDateTime.now());

        // KP : Debug Print
        logger.info("KP : KPJavaSpringBootApplication : main() : " + LocalDateTime.now());
        System.out.println("KP : KPMain - com.kpjavaspringboot : main() : " + LocalDateTime.now());
        System.out.println("KP : KPMain - Fiserv Interview : " + LocalDateTime.now());

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


        //        ///KP : Write program to get square of no -3,-2,-1,0,4,5,6 in sorted order
        //        int[] Input = {-3, -2, -1, 0, 4, 5, 6};
        //        int n = Input.length;
        //
        //        int[] Output = new int[n - 1];
        //
        //        System.out.println("KP : KPMain - com.kpjavaspringboot : main() :  n = " + n);
        //
        //        for (int i = 0; i < n - 1; i++) {
        //            int tmp = Input[i];
        //            System.out.println("KP : KPMain - com.kpjavaspringboot : main() :  tmp  = " + tmp + " (tmp * tmp) = " + (tmp * tmp) + " (int) (Math.pow(tmp, 2); " + (int) (Math.pow(tmp, 2)));
        //            Output[i] = (tmp * tmp);
        //        }
        //
        //        Arrays.sort(Output);
        //        System.out.println("KP : KPMain - com.kpjavaspringboot : main() :  Output = " + Arrays.toString(Output));

    }

}

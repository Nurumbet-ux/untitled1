package com.company;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static double realinfo;


    public static void main(String[] args) {
        double[] noreason = {3.2, 2.4, -1.2, 3.4, 5.6, -7.8, 9.4, -2.3, 4.7, -3.9, 1.9, -12.4, -45.6, 1.7, -8.1};

        for (int i = 0; i < noreason.length; i++) {
            realinfo = noreason[i];

            for (int j = i; j < noreason.length; j++) {

                if (noreason[j] <= noreason[i] && noreason[j] <= realinfo ) {
                     realinfo = noreason[j];
                }
            }

            System.out.println(realinfo);

             

        }
    }
}

package music.utils;

import java.util.List;


public class Printer {

    public static void print(List list){

        System.out.println("INSTRUMENT\t " + "NAME\t\t " + "PRISE");
        for (Object o : list) {
            System.out.println("---------------------------------");
            System.out.println(o.toString()+"");
        }
    }
}

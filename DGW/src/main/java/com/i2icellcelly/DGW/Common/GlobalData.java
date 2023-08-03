package com.i2icellcelly.DGW.Common;

import java.util.Date;
import java.util.Random;

public class GlobalData {
    
    public static final String HAZEL_ADDRESS = "http://34.133.255.110:8095/api/hazelcast/";
    public static final String OCS_AKKA_ADDRESS = null;

    public static String randomMSISDN(){
        Random rand = new Random();

        String[] names = new String[]{"Ali", "Ayse", "Fatma", "Mehmet", "Selim", "Selin", "Koray", "Selma", "Arda",
                "Burak","Elif", "Duru", "Hatice", "Enis", "Muhammed", "Cinar", "Reha", "Selcan", "Aycan",
                "Lara", "Hakan", "Funda", "Ertugrul", "Mukadder", "Seda", "Emre", "Alper", "Mustafa"};

        int randomIndex = rand.nextInt(names.length);

        return names[randomIndex];
    }

    public static String randomID(){
        Random rand = new Random();

        return Integer.toString(rand.nextInt(1000));
    }

    public static int randomUsage(){
        Random random = new Random();

        return random.nextInt(100);
    }

    public static Date randomDate(){
        return null;
    }
    
}

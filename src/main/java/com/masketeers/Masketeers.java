package com.masketeers;

import java.util.Random;

/**
 *
 * @author Yodela IT
 */
public class Masketeers {
    public static void main(String[] args) {
        Random rm = new Random();
        System.out.println(String.format("Your moeitemeter value is: %d", rm.nextInt()));
    }
}

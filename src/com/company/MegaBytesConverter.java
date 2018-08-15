package com.company;

/**
 * created by s.a.miroshnychenko 8/15/2018
 */

public class MegaBytesConverter {
    public void printMegabytesAndKilobytes(int kilobytes) {
        if (kilobytes < 0) {
            System.out.println("Invalid Value");
        } else if (kilobytes > 0) {
            System.out.println(kilobytes + " KB = " + kilobytes / 1024 + " MB and " + kilobytes % 1024 + " KB");
        }

    }
}

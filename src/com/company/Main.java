package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

	double boy,kilo;
        System.out.println("Lutfen boyunuzu(metre cinsinden) giriniz:");
        boy=scan.nextDouble();
        System.out.println("lutfen kilonuzu giriniz:");
        kilo=scan.nextDouble();
        double kitleİndeksi=kilo/(boy*boy);
        System.out.println("Vucut kitle indeksiniz:"+kitleİndeksi);
    }
}

package com.BarisKarapelit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("How many are you Record :");

        int Record = scanner.nextInt();
        System.out.println("------------------------------");


        String[] isim = new String[90];
        String soyisim[] = new String[90];
        for (int i = 0; i < Record; i++) {
            System.out.print("Enter the Name :");
            isim[i] = scanner.next();


            System.out.printf("Enter the Surname :");
            soyisim[i] = scanner.next();
            System.out.println("------------------------------");
        }
        Birlestir(isim, soyisim, Record);

    }


    public static void Birlestir(String[] isim, String[] soyisim, int Record) {
       String fullNames = new String();
        for (int i = 0; i < Record; i++)
        {
            int rastgeleYasBilgisi=(int)(Math.random()*70);
            fullNames+= isim[i]+" "+soyisim[i]+" "+rastgeleYasBilgisi+"\n";
        }
        System.out.print(fullNames);
    }
}
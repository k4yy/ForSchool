package com.company;


import java.math.BigInteger;
import java.util.Scanner;

public class Mod {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            BigInteger n = scanner.nextBigInteger();
        BigInteger m = scanner.nextBigInteger();
            int p = scanner.nextInt();

            BigInteger n1 = n;
            if (p != 1)
            for (int i = 0; i <= p - 2; i++) {
                n = n.multiply(n1);
            }
            int a = n.compareTo(m);
            while (a >= 0) {
                n = n.subtract(m);
                a = n.compareTo(m);
            }
            System.out.println(n);
        }



    }


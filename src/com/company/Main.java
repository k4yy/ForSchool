package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long p = scanner.nextLong();
        System.out.println((int) Math.pow(n,p) % m);
    }
}


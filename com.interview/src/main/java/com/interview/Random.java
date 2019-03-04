package com.interview;

import java.util.Scanner;

public class Random {
public static void main(String args[]) {
Scanner scanner = new Scanner(System.in);
System.out.print("Number of integers: ");
int intNumberOfIntegers = scanner.nextInt();

int intStorage[] = new int[intNumberOfIntegers];

System.out.println("Please prompt numbers!");

for(int i = 0;i < intStorage.length;i++) {
intStorage[i] = scanner.nextInt();
}

System.out.println("Your numbers are");

for(int i = 0;i < intStorage.length;i++) {
System.out.print(intStorage[i] + " ");
}
}
}
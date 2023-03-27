package org.example.personal;
import java.util.Scanner;
public class P_main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;

        n = s.nextInt();

        for(int i = 1;i <= 9; i++) {
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
    }

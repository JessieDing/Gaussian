package com.jessie;

import java.util.Scanner;

public class GaussianFormula {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n=（请输入大于等于4的整数）");
        String num = scan.nextLine();
        int n = Integer.parseInt(num);
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("1 + 2 + 3 + ··· + n = "+sum);
    }
}

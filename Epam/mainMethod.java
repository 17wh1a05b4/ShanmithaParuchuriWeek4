package Epam;

import java.util.Scanner;
public class mainMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.format("Select Standard type for House Construction: \n");
        System.out.format("1. Standard\n2.High Standard\n3.Very High Standard\n");
        int num = sc.nextInt();
        System.out.format("Enter Area of House\n");
        int area = sc.nextInt();
        costCalc cc = new costCalc(num ,area);
        cc.finalPrice();
    }
}

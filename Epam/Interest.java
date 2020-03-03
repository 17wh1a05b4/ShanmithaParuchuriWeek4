package Epam;

import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.format("Principal Amt? \n");
        double pa = sc.nextInt();
        System.out.format("Rate Of Interest?\n");
        double roi = sc.nextInt();
        System.out.format("Time Period?\n");
        int tp = sc.nextInt();
        System.out.format("1. Simple Interest\n2. Compound Interest\n3. Exit\n");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                double SI = ( pa * roi * tp ) / 100;
                System.out.format("Your Simple Interest is :- " + SI);
                break;
            case 2:
                double CI = pa * Math.pow( ( 1 + roi / 100.0) , tp );
                System.out.format("Your Compound Interest is :- " + CI);
                break;
            case 3:
                System.out.close();
                default:
                    System.out.format("Invalid Choice!");
                    System.out.close();
        }
    }
}

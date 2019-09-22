/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dohoagame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Dohoagame {

    /**
     * @param args the command line arguments
     */
    static int a, b, c,xacsuat;
    final static int LENGTH = 10;

    public static void main(String[] args) {
        Random rd = new Random();

        while (true) {
            xacsuat=rd.nextInt(20);
            if(xacsuat%3==0){
                c=a+b;
            }else{
                c=rd.nextInt(20);
            }
            a = (int) (Math.random() * LENGTH);
            b = (int) (Math.random() * LENGTH);
            c = rd.nextInt(20);
            System.out.println("" + a + "+" + b + "=" + c + "");
            String nhap = input();

            boolean kiemtra = check(nhap);
            boolean kiemtra1 = check1(nhap);

            if (kiemtra == false) {
                break;
            }
        }

    }

    private static String input() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }

    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    private static boolean check(String nhap) {
        boolean flag = false;
        switch (nhap) {
            case "d":
                if (a + b == c) {
                    System.out.println("GOOD");
                    flag = true;
                }
                break;
            case "s":
                if (a + b == c) {
                    System.out.println("Ngu vcl");
                    flag = false;
                    
                }
                break;

        }
        return flag;
    }

    private static boolean check1(String nhap) {
        boolean flag = false;

        switch (nhap) {
            case "d":
                if (a + b != c) {
                    System.out.println("Ngu vcl");
                    flag = false;

                }
                break;
            case "s":
                if (a + b != c) {
                    System.out.println("Good");
                    flag = true;
                    break;
                }

        }
        return flag;
    }
}

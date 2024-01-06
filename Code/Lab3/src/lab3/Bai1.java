/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author tungk
 */
public class Bai1 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        boolean check = true;
        if(number < 2){
            System.out.printf("%d khong phai so nguyen to\n",number);
        }else{
            for(int i=2;i<number;i++){
                if(number % i == 0){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.printf("%d la so nguyen to\n",number);
            }else{
                System.out.printf("%d khong la so nguyen to\n",number);
            }
        }
    }
}

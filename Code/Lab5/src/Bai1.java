
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungk
 */
public class Bai1 {
    public static void main(String[] args) {
        ArrayList<Double> dsSoThuc = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Nhap so thuc: ");
            Double numb = Double.parseDouble(sc.nextLine());
            dsSoThuc.add(numb);
            System.out.println("Nhap them (y/n)");
            String yn = sc.nextLine();
            if(yn.equals("n")){
                break;
            }
        }
        for(Double x : dsSoThuc){
            System.out.println("\t"+x);
        } 
    }
}

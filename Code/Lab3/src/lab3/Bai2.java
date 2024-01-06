/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author tungk
 */
public class Bai2 {
    public static void main(String[] args) {
        int hang,cot;
        for(int i=1;i<11;i++){
            hang=i;
            System.out.printf("\t%d\n",hang);
            for(int j=1;j<11;j++){
                cot = j;
                System.out.printf("%d x %d = %d",hang,cot,hang*cot);
                System.out.println("");
            }
        }
    }
}

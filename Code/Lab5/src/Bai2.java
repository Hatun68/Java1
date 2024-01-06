
//import static java.lang.System.console;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungk
 */
public class Bai2 {
    public static void main(String[] args) {
        int chonCN;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("+---------------------------------------+");
            System.out.println("| 1. Nhap danh sach ho va ten           |");
            System.out.println("| 2. Xuat danh sach vua nhap            |");
            System.out.println("| 3. Xuat danh sach ngau nhien          |");
            System.out.println("| 4. Sap xep giam dan va xuat danh sach |");
            System.out.println("| 5. Tim va xoa ho ten nhap tu ban phim |");
            System.out.println("| 6. Thoat                              |");
            System.out.println("+---------------------------------------+");
            System.out.println("Moi chon chuc nang: ");
            chonCN = Integer.parseInt(sc.nextLine());
            switch (chonCN){
                case 1:{
                    //console.clear();
                    System.out.println("Da chon chuc nang 1");
                    break;
                }
                case 2:{
                    System.out.println("Da chon chuc nang 2");
                    break;
                }
                case 3:{
                    System.out.println("Da chon chuc nang 3");
                    break;
                }
                case 4:{
                    System.out.println("Da chon chuc nang 4");
                    break;
                }
                case 5:{
                    System.out.println("Da chon chuc nang 5");
                    break;
                }
                case 6:{
                    System.out.println("Thoat!");
                    break;
                }
                default :{
                    System.out.println("Khong co chuc nang nay. Nhap lai!");
                    break;
                }
            }
        } while (chonCN != 6);
    }
}

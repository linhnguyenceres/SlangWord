
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Main {
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int chon;
            do
        {
            System.out.println("1. Tim kiem theo slang word");
            System.out.println("2. Tim kiem theo definition");
            System.out.println("3. Hien thi history");
            System.out.println("4. Them 1 slang word moi");
            System.out.println("5. Sua 1 slang word");
            System.out.println("6. Xoa 1 slang word");
            System.out.println("7. Reset danh sach slang word goc");
            System.out.println("8. Random 1 slang word");
            System.out.println("9. Do vui voi random slang word");
            System.out.println("10. Do vui voi definition slang word");
            System.out.println("____________________________");
            System.out.println("Chon chuc nang : ");
            chon=in.nextInt();
        switch(chon)
        {
            case 1:
                break; 
            case 2:
                break;  
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6: 
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                {
                    System.out.println("Thoat!");
                    System.exit(0);
                }
            }
        }
        while(chon!=0);
        }
}

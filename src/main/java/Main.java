
import java.io.IOException;
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
        public static void main(String[] args) throws IOException {
            Scanner in=new Scanner(System.in);
            int chon;
            SlangWord slang = new SlangWord();
            slang.writeToTempSlangwordFile();
            do
        {
            System.out.println("1. Tim kiem theo slang word");
            System.out.println("2. Tim kiem theo dinh nghia");
            System.out.println("3. Hien thi history");
            System.out.println("4. Them 1 slang word moi");
            System.out.println("5. Sua 1 slang word");
            System.out.println("6. Xoa 1 slang word");
            System.out.println("7. Reset danh sach slang word goc");
            System.out.println("8. Random 1 slang word");
            System.out.println("9. Do vui voi random slang word");
            System.out.println("10. Do vui voi dinh nghia slang word");
            System.out.println("____________________________");
            System.out.print("Chon chuc nang : ");
            chon = in.nextInt();
        switch(chon)
        {
            case 1:
                slang.findBySlangword();
                break; 
            case 2:
                slang.findByDefinition();
                break;  
            case 3:
                slang.showHistory();
                break;
            case 4:
                slang.AddNewSlangWord();
                break;
            case 5:
                slang.EditSlangWord();
                break;
            case 6: 
                slang.DeleteSlangWord();
                break;
            case 7:
                slang.Reset();
                break;
            case 8:
                slang.RandomSlagWord();
                break;
            case 9:
                slang.QuizFirst();
                break;
            case 10:
                slang.QuizSecond();
                break;
            case 11:
                {
                    System.out.println("Thoat!");
                    System.exit(0);
                }
            }
        }
        while(chon!=0);
        }
}

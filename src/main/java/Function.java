
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
class SlangWord {

    private HashMap<String, String> map;
    private final Stack<String> historyStack;
    Scanner sc = new Scanner(System.in);
    
    public SlangWord() {
        map = new HashMap<>();
        historyStack = new Stack();
        if (ReadTempSlangwordFile() == false) {
            ReadFromSlangwordFile();
        }
    }

    public boolean ReadTempSlangwordFile() {
        map = new HashMap<>();
        try {
            File file = new File("tempSlangword.txt");
            try (Scanner myReader = new Scanner(file)) {
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    String[] arrayOfString = data.split("`", 2);
                    if (arrayOfString.length < 2) {
                        continue;
                    }
                    map.put(arrayOfString[0].trim(), arrayOfString[1].trim());
                }
                System.out.println(map);
                return true;
            }
        } catch (Exception e) {
            System.out.println("ABC");
            e.printStackTrace();
        }
        return false;
    }

    public void ReadFromSlangwordFile() {
        map = new HashMap<>();

        try (BufferedReader in = new BufferedReader(new FileReader("slang.txt"))) {
            String line;
            while ((line = in.readLine()) != null) {
                if (line.split("`").length < 2) {
                    continue;
                }
                String[] pair = line.split("`");
                map.put(pair[0].trim(), pair[1].trim());
            }

//            map.entrySet().forEach((entry) -> {
//                System.out.println("Key: " + entry.getKey() + ". Value: " + entry.getValue());
//            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void findBySlangword() {
        System.out.println("Nhap slag word can lay : ");
        String SlagWord = sc.nextLine();
        historyStack.push(SlagWord);


        if (map.containsKey(SlagWord)) {
            System.out.println("Slangword tim duoc la : ");
            System.out.println(map.get(SlagWord));
        } else {
            System.out.println("Khong ton tai slangword nay!");
        }
    }
    
    public void findByDefinition() {
        System.out.println("Nhap dinh nghia: ");
        String definition = sc.nextLine();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().toLowerCase().contains(definition.toLowerCase())) {
                System.out.println(entry.getKey());
            }
        }
    }
    
    public void showHistory() {
        System.out.println("Danh sach cac slang word da tim sap xep theo moi nhat:");
        int count = 0;
        for (int i = this.historyStack.size() - 1; i >= 0; i--) {
            System.out.println(this.historyStack.get(i));
            count++;
            if (count == 10) {
                break;
            }
        }
    }
    
     public void AddNewSlangWord() {
        System.out.println("Nhap slang word can them : ");
        String slag = sc.nextLine();
        System.out.println("Nhap dinh nghia cua slang word: ");
        String mean = sc.nextLine();
        if (map.containsKey(slag) == true) {
            System.out.println("Slang word da ton tai!!Ban muon ghi de hay them moi??");
            System.out.println("0.Huy bo thao tac");
            System.out.println("1.Them moi");
            System.out.println("2.Ghi de");
            String choose = sc.nextLine();
            switch (choose) {
                case "0":
                    break;
                case "1":
                    map.put(slag, mean);
                    break;
                case "2":
                    map.put(slag, map.get(slag) + "| " + mean);
                    break;
                default:
                    System.out.println("Khong co lua chon nay!");
                    break;
            }

        }
    } 
     
    public void EditSlangWord() {
        System.out.println("Nhap slang word can tim : ");
        String slag = sc.nextLine();
        if (map.containsKey(slag) == false) {
            System.out.println("Khong tim thay slag word!");
        } else {
            System.out.println("Nhap lua chon : ");
            System.out.println("0.Huy thao tac");
            System.out.println("1.Chinh sua slang word");
            System.out.println("2.Chinh sua y nghia cua slang word");
            System.out.println("3.Chinh sua slang word va y nghia");
            String choose = sc.nextLine();
            switch (choose) {
                case "0":
                    break;
                case "1":
                    System.out.println("Nhap slag word moi");
                    String NewSlagWord = sc.nextLine();
                    map.put(NewSlagWord, map.get(slag));
                    map.remove(slag);
                    break;
                case "2":
                    System.out.println("Nhap y nghia moi cua slang word:");
                    String NewMeanning = sc.nextLine();
                    map.put(slag, NewMeanning);
                    break;
                case "3":
                    System.out.println("Nhap slang word moi");
                    NewSlagWord = sc.nextLine();
                    System.out.println("Nhap y nghia moi cua slang word:");
                    NewMeanning = sc.nextLine();
                    map.remove(slag);
                    map.put(NewSlagWord, NewMeanning);
                    break;
                default:
                    System.out.println("Khong co lua chon nay!!");
                    break;
            }
        }
    }
    
    public void DeleteSlangWord() {
        System.out.println("Nhap slang word can xoa : ");
        String SlagWord = sc.nextLine();
        if (map.containsKey(SlagWord) == false) {
            System.out.println("Khong ton tai slang word nay!");
        } else {
            System.out.println("Ban co chac chan muon xoa tu nay?");
            System.out.println("1.Xoa ngay");
            System.out.println("2.Huy");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    map.remove(SlagWord);
                    System.out.println("Xoa slang word thanh cong!");
                    break;
                case "2":
                    break;
                default:
                    System.out.println("Khong tim thay lua chon!!");
            }
        }

    }

}

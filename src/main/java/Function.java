
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

//    public void PrintList() {
//        map.entrySet().forEach((entry) -> {
//            System.out.println("Key: " + entry.getKey() + ". Value: " + entry.getValue());
//        });
//    }
    public void findBySlangword() {

        Scanner sc = new Scanner(System.in);
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap definiton: ");
        String definition = sc.nextLine();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().toLowerCase().contains(definition.toLowerCase())) {
                System.out.println(entry.getKey());
            }
        }
    }
    
    public void showHistory() {
        System.out.println("Danh sach cac slag word da tim sap xep theo moi nhat:");
        int count = 0;
        for (int i = this.historyStack.size() - 1; i >= 0; i--) {
            System.out.println(this.historyStack.get(i));
            count++;
            if (count == 10) {
                break;
            }
        }
    }

}

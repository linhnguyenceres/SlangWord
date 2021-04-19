
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
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
class SlangWord{

    private HashMap<String, String> map;
//    private final Stack<String> historyStack = null;
    
    public boolean ReadTempSlangwordFile() {
    try{
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
                return true;
        }
    }
    catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public void ReadFromSlangwordFile() {
//         try {
//            File myObj = new File("slang.txt");
//            try (Scanner myReader = new Scanner(myObj)) {
//                while (myReader.hasNextLine()) {
//                    String data = myReader.nextLine();
//                    String[] arrayOfString = data.split("`", 2);
//                    if (arrayOfString.length < 2) {
//                        continue;
//                    }
//                    map.put(arrayOfString[0].trim(), arrayOfString[1].trim());
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
         

        try(BufferedReader in = new BufferedReader(new FileReader("slang.txt"))){
            String line;
            while((line = in.readLine())!=null){
                String[] pair = line.split("`");
                map.put(pair[0].trim(), pair[1].trim());
            }
            
            map.entrySet().forEach((entry) -> {
            System.out.println("Key: " + entry.getKey() + ". Value: " + entry.getValue());
        });
        }catch(Exception e){
            e.printStackTrace();
        }
    }

//    public void PrintList() {
//        map.entrySet().forEach((entry) -> {
//            System.out.println("Key: " + entry.getKey() + ". Value: " + entry.getValue());
//        });
//    }

    public void findBySlangword() {
//        String push = historyStack.push(SlagWord);
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap slag word can lay : ");
        String SlagWord = sc.nextLine();
        
        for (int i = 1; i <= map.size(); i++) {
            System.out.println(map);
        }
        
        if (map.containsKey(SlagWord)) {
            System.out.println("Slangword tim duoc la : ");
            System.out.println(map.get(SlagWord));
        } else {
            System.out.println("Khong ton tai slangword nay!");
        }
    }
    
    

}

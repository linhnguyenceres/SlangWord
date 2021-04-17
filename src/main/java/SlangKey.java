
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class SlangKey {
    static ArrayList<String> History = new ArrayList<>();
    private static HashMap<String, String>SlangWord;
    static ArrayList<String> fromStringToSlang(List<String>input){
        
    }
    
    static ArrayList<String> fromStringToMeaning(List<String>input){
        
    }
    
    static HashMap<String, String> slangKey(List<String>slang, List<String>meaning){
        HashMap<String, String> temp = new HashMap<>();
        for(int i=0; i< slang.size; i++){
            
        }
        return temp;
    }
    
    public String findSlangWord(String input){
        return SlangWord.get(input);
    }
    
    public void inputWord(String in){
        History.add(in + ": " + SlangWord.get(in));
    }
    
    public void showHistory(){
        
    }
    
    static boolean existSlang(String in){
        
    }
}

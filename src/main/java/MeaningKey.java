
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
public class MeaningKey {
    static ArrayList<String> History = new ArrayList<>();
    private static HashMap<String, String>SlangWord;
    static ArrayList<String> fromStringToSlang(List<String>input){
        
    }
    
    static ArrayList<String> fromStringToMeaning(List<String>input){
        
    }
    
    static HashMap<String, String> meaningKey(List<String>slang, List<String>meaning){
        
    }
    
    public String findSlangWord(String input){
        return SlangWord.get(input);
    }
    
    public void inputWord(String in){
        History.add(in + ": "+SlangWord.get(in));
    }
    
    public boolean existSlang(String in){
        return SlangWord.containsKey(in);
    }
    
    public void addNewWord(String slangin, String meaningin){
        
    }
    
    public void deleteWord(String in){
        
    }
    
    public void editWord(String oldSlang, String newSlang, String newMeaning){
        
    }
    
    
    public void reset(){
        
    }
    
    public void quiz(){
        
    }
    
    public void setSlangWordWithMeaningKey(List<String>input){
        
    }
    
    public List<String> getSlangWord(){
        
    }
}

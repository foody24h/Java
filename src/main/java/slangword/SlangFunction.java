/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slangword;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

/**
 *
 * @author an9x0
 */
public class SlangFunction {
    private HashMap<String, ArrayList<String>> slangWords;
    private SlangWordDAO slangWordDAO; 
    
    public SlangFunction(){
        slangWordDAO = new SlangWordDAO();
        slangWords = slangWordDAO.read();
        System.out.println("Xin Chao");
        Set<String> keySet = slangWords.keySet();
        System.out.println("Load slang word list" );
        for (String key : keySet) {
            System.out.println(key + " " + slangWords.get(key));
        }
        System.out.println("End load slang word lis");
    }
    
    public HashMap<String, ArrayList<String>> getSlangWordList(){
        return slangWords;
    }
    
    public void CreateNewSlang(HashMap<String, ArrayList<String>> sl){
        slangWordDAO.createNewSlang(sl);
    }
    public void save(HashMap<String, ArrayList<String>> sl){
        slangWordDAO.save(sl);
    }
    
    public void reset(){
        slangWordDAO.copyFile();
        slangWordDAO.read();
    }
}

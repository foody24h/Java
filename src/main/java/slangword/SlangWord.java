/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slangword;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author an9x0
 */
public class SlangWord implements Serializable{
    private String slangWord;
    private ArrayList<String> define;
    
    public SlangWord(String slangWord, ArrayList<String> define){
        this.slangWord = slangWord;
        this.define = define;
    }
    
    public String getSlangWord(){
        return slangWord;
    }
    
    public void setSlangWord(String slangWord){
        this.slangWord = slangWord;
    }
    
    public ArrayList<String> getDefine(){
        return  define;
    }
    
    public void setDefine(ArrayList<String> define){
        this.define = define;
    }
}

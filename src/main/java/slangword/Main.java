/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slangword;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

/**
 *
 * @author an9x0
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CardLayout cl = new CardLayout();
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() 
            {
               SlangFunction slangFunction = new SlangFunction();
               HashMap<String, ArrayList<String>> SlangWordList = slangFunction.getSlangWordList();
               cl.createAndShowGUI(SlangWordList);
            }
        });
    }
    
}

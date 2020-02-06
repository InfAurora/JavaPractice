/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Jose
 */
public class StateCapitals2 {
    public static final String File ="StateCapitals.txt";
    public static final String Delimit = "::";
    
    public static void main(String[] args) throws Exception{
        int lineCounter = 0;
        Random rng = new Random();
        PrintWriter out = new PrintWriter(new FileWriter("StateCapitals.txt", true));
        Scanner newScan = new Scanner(
                new BufferedReader(new FileReader("StateCapitals.txt")));
        
        Map<String, String> stateCapitals = new HashMap<>();
        Set<String> keys = stateCapitals.keySet();
        List<String> stringList = new ArrayList<>();
        
        while(newScan.hasNextLine()) {
            
            String currentLine = newScan.nextLine();
            lineCounter++;
            String[] parts = currentLine.split(Delimit);
            stateCapitals.put(parts[0], parts[1]);
            
        }
        System.out.println(lineCounter);
        System.out.println(stateCapitals);
        stringList.addAll(keys);
        int pos = rng.nextInt(stringList.size());
        
        String state = stringList.get(pos);
        String capital = stateCapitals.get(state);
        System.out.println(state);
        
        System.out.println("Choose a state!");
        String guess = newScan.nextLine();
        
        //make a new scanner
        if (state.equals(guess)) {
            System.out.println("Correct!");
        } 
       
    }
    
}

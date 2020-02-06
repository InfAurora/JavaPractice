/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Jose
 */
public class StateCapitals {

    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();

        capitals.put("Alabama", "Montgomery");
        capitals.put("Alaska", "Juneau");
        capitals.put("Arizona", "Phoenix");
        capitals.put("Arkansas", "Little Rock");

        Set<String> keys = capitals.keySet();
        for (String k : keys) {
            System.out.println(k);
        }
        for (String k : keys) {
            System.out.println(capitals.get(k));
        }

        for (String k : keys) {
            System.out.print(capitals.get(k) + " ");
            System.out.println(k);
        }
        System.out.println(capitals);

    }
}

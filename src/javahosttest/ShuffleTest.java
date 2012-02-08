/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javahosttest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Janek
 */
public class ShuffleTest {

    public static void main(String[] args) {
        List<String> sl = new ArrayList<String>();
        sl.add("One");
        sl.add("Two");
        sl.add("Three");
        sl.add("Four");
        sl.add("Five");
        sl.add("Six");
        for (String s : sl) {
            System.out.println(s);
        }
        System.out.println();
        Collections.shuffle(sl);
        for (String s : sl) {
            System.out.println(s);
        }
    }
}


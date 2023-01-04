package sdf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TaskMain {
    public static void main(String[] args) {

        List<Car> garage = new LinkedList<>(); 
        Set<String> addressbook = new HashSet<>();
        Map<String, Integer> debts = new HashMap<>();
        
        //Add cars to garage
        garage.add(new Car());
        garage.add(new Porche());
        garage.add(new Porche("white", "1234"));

        System.out.println(garage);

        //Add names to addressbook
        addressbook.add("fred");
        addressbook.add("barney");
        addressbook.add("wilma");
        addressbook.add("fred"); //fred will only apear once in output

        System.out.println(addressbook);

        //Add my debtors 
        debts.put("fred", 10);
        debts.put("barney", 10);
        debts.put("fred", 100); //changes value for fred to 100

        System.out.println(debts);
    }
}

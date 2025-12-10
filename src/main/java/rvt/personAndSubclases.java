package rvt;

import java.util.ArrayList;

public class personAndSubclases {
    public static void main(String[] args) {
    ArrayList<person> persons = new ArrayList<person>();
    persons.add(new teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
    persons.add(new student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

    printPersons(persons);
}

public static void printPersons(ArrayList<person> persons){
    for(person p : persons){
        System.out.println(p);
        System.out.println();
    }
}

}

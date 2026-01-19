package Estructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import models.Person;

public class Maps {
    //Mapas o diccionarios
    public Map<String, Integer> construirHashMap() {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 5);
        hashMap.put("B", 3);
        hashMap.put("C", 50);
        hashMap.put("D", 5);
        hashMap.put("F", 3);
        hashMap.put("G", 8);
        hashMap.put("H", 85); 
        hashMap.put("I", 5); 

        

        hashMap.size();
        for (int i = 0; i < hashMap.size(); i++) {
            System.out.println(hashMap.values().toArray()[i]);
            
        }
        for (String key : hashMap.keySet()) {
            System.out.println("Llave: " + key + "Valor: " + hashMap.get(key));

            
        }
        return hashMap;
    }


    public Map<String, Integer> contruirlinkedHashMap(){
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("A", 2);
        linkedHashMap.put("B", 3);
        linkedHashMap.put("A", 5);
        linkedHashMap.put("C", 50);
        linkedHashMap.put("D", 5);
        linkedHashMap.put("F", 8);
        linkedHashMap.put("G", 1);
        linkedHashMap.put("H", 85);
        linkedHashMap.put("I", 5);  
        System.out.println(linkedHashMap.values());
        System.out.println(linkedHashMap.keySet());

        return linkedHashMap;
    }

    public Map<String, Integer> contruirTreeMap(){
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("A", 2);
        treeMap.put("B", 3);
        treeMap.put("A", 5);
        treeMap.put("C", 50);
        treeMap.put("D", 5);
        treeMap.put("F", 8);
        treeMap.put("G", 1);
        treeMap.put("H", 85);
        treeMap.put("I", 5);  
        System.out.println(treeMap.values());
        System.out.println(treeMap.keySet());

        return treeMap;
    }


    public Map<Person, Integer> contruirtreeMap(){
        Map<Person, Integer> treePerson = new TreeMap<>();
        treePerson.put(new Person("Carlos ", 25), 1000);
        treePerson.put(new Person("Ana ", 30), 2000);
        treePerson.put(new Person("Luis ", 18), 3000);
        treePerson.put(new Person("Ana ", 20), 4000);
        treePerson.put(new Person("Andres ", 23), 5000);
        treePerson.put(new Person("Luis ", 18), 6000);
        
        return treePerson;

    }

    public void printFilter(Map<Person, Integer> treeMap){
        for(Person key: treeMap.keySet()){
            Integer value = treeMap.get(key);
            if(value >= 3000){
                System.out.println("Person [" + key + " Valor: " + value+"]");
            }
         }
    }


    public Map<Integer, Person> contruirtreeMapPersons(){
        Map<Integer, Person> treeMapPersons = new TreeMap<>();
        treeMapPersons.put(3, new Person("Carlos", 25));
        treeMapPersons.put(1, new Person("Ana", 30));
        treeMapPersons.put(4, new Person("Luis", 18));
        treeMapPersons.put(2, new Person("Andres", 23));

        return treeMapPersons;

    }

    public Map<Integer, Person> contruirTreeMapPersonObj(){
       List<Person> list = new ArrayList<>();
        list.add(new Person("Carlos", 23, 123));
        list.add(new Person("Ana", 30, 124));
        list.add(new Person("Luis", 18, 125));
        list.add(new Person("Ana", 20, 126));
        list.add(new Person("Andres", 23, 127));
        list.add(new Person("Luis", 18, 128));


        //Map<Cedula, Person>
        //Para que no permita cedulas duplicadas
        Map<Integer, Person> persons = new TreeMap<>();
        for ( Person  p : list) {
            persons.put(p.getCedula(), p);
            System.out.println(p.getCedula() + " " + p.getName());
            
        }
       

        return persons;
    }
}

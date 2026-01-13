package Estructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import models.Person;

public class Sets {

    public Set<String> construirHashSet(){
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("D");
        return hashSet;

    }

    public Set<String> construLinkedHashSet(){
        Set<String> linkedhahSet = new LinkedHashSet<>();
        linkedhahSet.add("A");
        linkedhahSet.add("B");
        linkedhahSet.add("C");
        linkedhahSet.add("A");
        linkedhahSet.add("D");
        return linkedhahSet;
    }

    public Set<String> construirTreeSet(){
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("D");
        treeSet.add("A");
        treeSet.add("E");
        treeSet.add("I");
        treeSet.add("O");
        treeSet.add("B");
        treeSet.add("a");
        return treeSet;
    }


    public Set<String> contruirTreeSerConComparador(){
        Set<String> treeSet = new TreeSet<>((pal1, pal2) -> pal1.compareToIgnoreCase(pal2));
        treeSet.add("D");
        treeSet.add("A");
        treeSet.add("E");
        treeSet.add("I");
        treeSet.add("O");
        treeSet.add("B");
        treeSet.add("a");
        return treeSet;
    }

    public Set<Person> personsTreeSet(){
        // Set<Person> treePerson = new TreeSet<>(
        //     (p1,p2) ->{
        //         // int com = Integer.compare(p1.getAge(), p2.getAge());
        //         // return com;
        //         int com = p2.getName().compareTo(p1.getName());
        //         if (com == 0){
        //             com = Integer.compare(p2.getAge(), p1.getAge());
        //         }
                
        //         return com;
        //     });

        Set<Person> treePerson = new TreeSet<>();

        treePerson.add(new Person("Carlos", 23));
        treePerson.add(new Person("Ana", 30));
        treePerson.add(new Person("Luis", 18));
        treePerson.add(new Person("Ana", 20));
        treePerson.add(new Person("Andres", 23));
        treePerson.add(new Person("Luis", 18));
        return treePerson;

        
    }
}


package models;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return  name + " "+ age ;
    }

    @Override
    public int compareTo(Person o) {
        int comN = this.name.compareTo(o.getName());
        if(comN!=0) return comN;

        int comE = Integer.compare(this.age, o.getAge());
        return comE;
        
        
    }
    
}

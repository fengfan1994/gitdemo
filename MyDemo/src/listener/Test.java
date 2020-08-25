package listener;

import java.util.HashMap;
import java.util.Hashtable;

public class Test {
    public static void main(String[] args) {
        Person person=new Person();
        person.registerListener(new PersonListener() {
            @Override
            public void doEat(Event event) {
                Person person1=event.getResource();
                System.out.println(person1+" is eating");
            }

            @Override
            public void doSleep(Event event) {
                Person person1=event.getResource();
                System.out.println(person1+" is sleeping");
            }
        });
        person.eat();
        person.sleep();

    }


}

package it.develhope.If4;

import it.develhope.If4.entities.Person;

/**
 * @author Tania Ielpo
 */

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("The person is in the "+ person.getLifeStage()+" stage of life");
    }
}


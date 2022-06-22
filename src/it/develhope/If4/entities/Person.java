package it.develhope.If4.entities;

/**
 * This class represents a person
 *
 * @author Tania Ielpo
 */

public class Person {

    int age;

    /**
     * the costructor generates and prints a random value using
     * Math.floor(Math.random()*(max-min+1)+min)
     */

    public Person(){
        this.age=(int)Math.floor((Math.random()*(80-5+1)+5));
        System.out.println(this.age);
    }

    /**
     * returns a string about the life stage of the Person
     * based on age groups
     * @return
     */

    public String getLifeStage() {
        if (this.age <= 12) return "Child";
        else if (this.age > 12 && this.age < 20) return "Teen";
        else if (this.age > 19 && this.age < 60) return "Adult";
        else return "Senior Adult";  //age>59
    }
}

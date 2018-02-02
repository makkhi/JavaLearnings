package java8;


class Person {

    String firstName;
    String lastName;

    public Person(){

    }
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "{firstName : }" + this.firstName + ",lastName : " + this.lastName + "}";
    }
}

interface PersonFactory<p extends Person> {
   p create(String firstName, String lastName);
}
public class MethodOrConstructorReference {

    public static void main(String[] args) {

        PersonFactory pFactory = Person::new;

        Person p = pFactory.create("ashish", "negi");

        System.out.println(p);


    }
}

package day27_statics_accessModifiers.personTask;

public class Test {
    public static void main(String[] args) {

        Person person1 = new Person("Josh", 28, 'M',"English");
        Person person2 = new Person("Breanna", 32, 'F',"French");

        System.out.println(person1);
        System.out.println(person2);

        System.out.println(person1.numberOfHead);
        System.out.println(person2.numberOfHead);

        System.out.println(person1.numberOfWings);
        System.out.println(person2.numberOfWings);

        System.out.println(person1.numberOfEyes);
        System.out.println(person2.numberOfEyes);


    }
}

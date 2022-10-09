package day27_statics_accessModifiers.dogTask;

public class Dog {

    public String name, breed, size,color;
    public int age;
    public char gender;
    public static int numberOfLegs,numberOfEyes,numberOfWings;
    public static boolean isFriendly;

    public Dog(String name, String breed, String size, char gender,int age, String color) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
        this.gender = gender;
    }
    static {
        numberOfEyes=2;
        numberOfLegs=4;
        numberOfWings=0;
        isFriendly=true;
    }
    public void  eat(){
        System.out.println(name+ " is eating");
    }
    public void  sleep(){
        System.out.println(name+ " is sleeping");
    }
    public void  drink(){
        System.out.println(name+ " is drinking");
    }
    public void  play(){
        System.out.println(name+ " is playing");
    }
    public void  bark(){
        System.out.println(name+ " is barking");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
3.  Create a class called Dog
            Variables:
                breed, size, gender, age, color, numberOfLegs, numberOfEyes, numberOfWings, isFriendly

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                eat()
                drink()
                sleep()
                play()
                bark()
                toString()
*/
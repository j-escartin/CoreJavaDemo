/**
 * created by James Vincent on 5/16/23
 **/
public class Inheritance {
    public static void main(String[] args){

        Bird bird = new Bird("Birdy");
        bird.eat();
        bird.tweet();

        System.out.println();

        Dog dog = new Dog("Doggy");
        dog.eat();
        dog.aww();
    }
}

class Animal {
    protected String name;

    public Animal(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println(name + " is eating.");
    }
}

class Bird extends Animal{
    public Bird(String name){
        super(name);
    }

    public void tweet(){
        System.out.println(name + " says tweet");
    }
}

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    public void aww(){
        System.out.println(name + " says aww!");
    }
}
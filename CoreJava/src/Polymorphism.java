/**
 * created by Acer on 5/16/23
 **/
public class Polymorphism {
    public static void main(String[] args){
        Flower flower1 = new Rose();
        Flower flower2 = new Orchid();

        flower1.color();
        flower2.color();
    }
}

class Flower{
    public void color(){
        System.out.println("All flowers have differt colors");
    }
}

class Rose extends Flower{
    public void color(){
        System.out.println("Rose is red");
    }
}

class Orchid extends Flower{
    public void color(){
        System.out.println("Orchid is purple");
    }
}

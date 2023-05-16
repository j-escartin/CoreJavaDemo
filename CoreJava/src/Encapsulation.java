/**
 * created by Acer on 5/16/23
 **/
public class Encapsulation {
    public static void main(String[] args) {
        Students James = new Students();

        //Setting the value
        James.setId(1);
        James.setName("James");

        //Getting the value
        System.out.println(James.getName() + " has the id of " + James.getId());
    }
}

class Students {

    private int id;
    private String name;

    // Getters
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    //Setters
    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }
}

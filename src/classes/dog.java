package classes;

public class dog {
    private String name ;
    private String breed;
    private int age ;

    @Override
    public String toString(){
        return name + breed + age;
    }
}

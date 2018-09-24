import java.util.Date;
public class Kata1 {
    public static void main(String[] args){
        Person p = new Person( "Adrian Negrin",new Date(95,7,7));
        System.out.println(p.getName() + " tiene actualmente "+ p.getAge());
    }
}

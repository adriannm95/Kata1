import java.util.Calendar;
import java.util.GregorianCalendar;
public class Kata1 {
    public static void main(String[] args){
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1995,7,7);
        Person p = new Person( "Adrian Negrin",date);
        System.out.println(p.getName() + " tiene actualmente "+ p.getAge());
    }
}

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private final String name;
    private final Calendar birth;
    private final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);

    public Person(String name, Calendar birth){
        this.name = name;
        this.birth = birth;

    }

    public String getName(){
        return name;
    }

    public Calendar getBirth(){
        return birth;
    }

    public int getAge(){
        Calendar today = GregorianCalendar.getInstance();
        return (int) (milliSecondsToYear(today.getTimeInMillis() - birth.getTimeInMillis()));
    }

    private long milliSecondsToYear(long milles){
        return milles / MILLISECONDS_PER_YEAR;
    }
}

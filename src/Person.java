import java.util.Date;
public class Person {
    private final String name;
    private final Date birth;
    public Person(String name, Date birth){
        this.name = name;
        this.birth = birth;
    }
    public String getName(){
        return name;
    }
    public Date getBirth(){
        return birth;
    }
    public int getAge(){
        return (int) ((new Date().getTime() - birth.getTime())/31536000000L);
    }
}

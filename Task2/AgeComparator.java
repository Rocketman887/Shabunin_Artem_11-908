import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    //Здесь сортировал по возрасту по возрастанию
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge()>o2.getAge()) return 1;
       else if(o1.getAge()<o2.getAge()) return -1;
        else return 0;
    }
}

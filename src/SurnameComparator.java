import java.util.Comparator;

public class SurnameComparator implements Comparator<Person> {


    public int compare(Person o1, Person o2) {
         
        if (o1.wordsQuantity() < o2.wordsQuantity()) {
            return -1;
        } else if (o1.wordsQuantity() > o2.wordsQuantity()) {
            return 1;
        } else
            return Integer.compare(o1.getAge(), o2.getAge());


    }
}

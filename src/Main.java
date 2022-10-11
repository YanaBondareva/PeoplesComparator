import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Хью", "Ричард Луи Гросвендор", 26);
        Person person2 = new Person("Чарльз", "Кадоган", 80);
        Person person3 = new Person("Мэри", "Ховард де Уолден", 43);
        Person person4 = new Person("Кристофер", "Беркли Портман", 67);
        Person person5 = new Person("Гарольд", "Ротемер Эсмонд Хармсворд Миллер Эшли", 23);
        Person person6 = new Person("Эдвард", "Артуа Феникс Гиннес Айви", 45);
        Person person7 = new Person("Дуэйн", "Ричард Гиннес Айви Уолден Младший", 85);
        List<Person> people = new ArrayList<>(Arrays.asList(person1, person2, person3, person4, person5, person6, person7));
        people.sort((p1, p2) -> {
            if (p1.wordsQuantity() < p2.wordsQuantity()) {
                return -1;
            } else if (p1.wordsQuantity() > p2.wordsQuantity()) {
                return 1;
            } else {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        });


        for (int i = 0; i < people.size(); i++) System.out.println(people.get(i).toSting());
    }
}






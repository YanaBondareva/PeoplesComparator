import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Хью", "Ричард Луи Гросвендор", 16);
        Person person2 = new Person("Чарльз", "Кадоган", 80);
        Person person3 = new Person("Мэри", "Ховард де Уолден", 43);
        Person person4 = new Person("Кристофер", "Беркли Портман", 17);
        Person person5 = new Person("Гарольд", "Ротемер Эсмонд Хармсворд Миллер Эшли", 23);
        Person person6 = new Person("Эдвард", "Артуа Феникс Гиннес Айви", 45);
        Person person7 = new Person("Дуэйн", "Ричард Гиннес Айви Уолден Младший", 85);
        List<Person> people = new ArrayList<>(Arrays.asList(person1, person2, person3, person4, person5, person6, person7));
        Collections.sort(people, new SurnameComparator());
        Predicate<Person> isAdult;
        isAdult = i -> i.getAge() < 18;
        Iterator<Person>personIterator = people.iterator();
        while (personIterator.hasNext())
        {Person nextPerson = personIterator.next();
            if (isAdult.test(nextPerson)){personIterator.remove();}


        }


        for (int i = 0; i < people.size(); i++) System.out.println(people.get(i).toSting());
    }
    }






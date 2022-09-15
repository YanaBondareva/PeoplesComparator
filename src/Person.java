
public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname() {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public int wordsQuantity() {
        String[] parts = surname.split(" ");
        return parts.length;
    }

    public String toSting() {
        return "Имя: " + getName() + " Фамилия: " + getSurname() + " Возраст: " + getAge();
    }


}

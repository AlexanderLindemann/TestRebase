
//класс билдер, который стряпает человека)
public class Person {
    private String name;
    private int age;
    private String surname;
    private int weight;

    private Person() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    public int getWeight() {
        return weight;
    }

    public class Builder {
        private Builder() {
        }

        public Builder setName(String name) {
            Person.this.name = name;
            return this;
        }
    }
}

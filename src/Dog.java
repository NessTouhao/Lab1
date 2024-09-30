public class Dog {
    private String name;
    private int age;

    public String getInf() {
        return name+""+age;
    }

    public void setInf(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int HumanAge() {
        return age*7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Main {
    public static Dog dog1 = new Dog("Jora", 12);
    public static Dog dog2 = new Dog("Lora", 14);
    public static Dog Dogs[] = new Dog[2];

    public static void main(String[] args) {
        System.out.println(dog1.getInf());
        System.out.println(dog2.getInf());
        dog1.setInf("Ale", 15);
        dog2.setInf("Sosiska", 5);
        System.out.println(dog1.getInf());
        System.out.println(dog2.getInf());
        System.out.println(dog1.HumanAge());
        System.out.println(dog2.HumanAge());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(Pitomnic(dog2, dog1));
        for (int i = 0; i < 2; i++) {
            System.out.println(Dogs[i]);
        }
    }

    public static Dog[] Pitomnic(Dog d1, Dog d2) {
        Dogs[0] = d1;
        Dogs[1] = d2;
        return Dogs;
    }
}

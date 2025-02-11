package Atribut;

public class Exo3 {
    public static void main(String[] args) {
        Dog red = new Dog();

        System.out.println(red.getName());
    }
    static class Animal {
        protected String name = "je suis protected";
    }
    static class Dog extends Animal {
        public String getName() {
            return name;
        }
    }
}

package Methods;
class Animal {
    void sound() {
        System.out.println("Animals make sounds.");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}
public class MethodOverrideExample
{
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
    }
}

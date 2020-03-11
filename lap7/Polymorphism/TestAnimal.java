package T1908a.lap7.Polymorphism;

import org.w3c.dom.ls.LSOutput;

public class TestAnimal {
    public static void main(String[] args) {
        Cat a1 = new Cat();
        a1.greeting();
        Dog d1 = new Dog();
        d1.greeting();

        Animal a11 = new Cat();
        a11.greeting();

        Animal a12 = new Dog();
        a12.greeting();

        Animal a13 = new BigDog();
        a13.greeting();

        //Downcast
        Dog dog2 = (Dog)a12;
        Cat cat2 = (Cat)a11;
        BigDog bDog2 = (BigDog)a13;

    }
}

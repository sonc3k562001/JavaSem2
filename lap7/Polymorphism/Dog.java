package T1908a.lap7.Polymorphism;

public class Dog extends Animal {
    @Override
    public void greeting(){
        System.out.println("woof");
    }
    public void greeting(Dog another){
        System.out.println("wooooooof!");
    }
}

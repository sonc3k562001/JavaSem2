package T1908a.lap7.Polymorphism;

public class BigDog extends Animal {
    @Override
    public void  greeting(){
        System.out.println("woow!");
    }

    public void greeting(Dog another){
        System.out.println("Woooooooooo!");
    }
}

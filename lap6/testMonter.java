package T1908a.lap6;

public class testMonter {
    public static void main(String[] args){
        //fire monter
        Monster m1 = new  FireMonster("fire");
        System.out.println(m1.attack()+m1.getName());
        // water monter
        Monster m2 = new WaterMonster("water");
        System.out.println(m2.attack()+m2.getName());
        //Stone monter
        Monster m3 = new StoneMonster("stone");
        System.out.println(m3.attack()+m3.getName());
    }
}

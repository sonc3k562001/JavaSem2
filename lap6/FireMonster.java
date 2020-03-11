package T1908a.lap6;

public class FireMonster extends Monster {
    public FireMonster(String name){
        super(name);
    }
    @Override
    public String attack(){
        return"Attack with fire!";
    }
}

import java.util.ArrayList;
import java.util.Random;

public class Mob extends Creature implements Lootable {
    Mob(int Hp,int Protection,String name,int Power,int id){
        super(Hp,Protection,Power,id,name);
    }
    public int getProtection(){
        return this.Protection;
    }
    public int getHp(){
        return this.Hp;
    }

    @Override
    public ArrayList<Item> dropLoot() {
           Random random= new Random();
           ArrayList<Item> items=new ArrayList<>();
           for (int i=0;i<random.nextInt(3);i++){
               items.add(new Equipment(
                   "a",
                   random.nextFloat()+2,
                   i+1,
                   random.nextInt(10)+10,
                   random.nextInt(12)+2));
           }
           return items;
    }
}

//все существа
public class Creature extends GameObject implements Damager,Attacker,Damageable {
    protected int Hp;
    protected int Protection;
    protected int power;
    Creature(int Hp,int Protection,int power,int id,String name){
        super(id,name);
        this.Hp=Hp;
        this.Protection=Protection;
        this.power=power;
    }

    @Override
    public int getDamager() {
        return this.power;
    }

    @Override
    public void attack(Damageable target) {
           target.getHit(this);
    }

    @Override
    public void getHit(Damager damager) {
         this.Hp-=damager.getDamager();
    }
}

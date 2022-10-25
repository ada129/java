
public class Player  extends Creature{
    int Level;
    int Exp;
    Player(int Hp, int Level, int Protection, int Exp, String name, int power,int id) {
        super(Hp,Protection,power,id,name);
        this.Exp = Exp;
        this.Level = Level;
    }


  public int getHp() {
        return this.Hp;
    }

    public int getLevel() {
        return this.Level;
    }

    public int getProtection() {
        return this.Protection;
    }

    public int getExp() {
        return this.Exp;
    }

    public boolean BuyersAssessment(EquipmentCell artifact) {
        return Level >= artifact.level;
    }
}

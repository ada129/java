
public class Player  extends GameObject {
    int Hp;
    int Level;
    int Protection;
    int Exp;

    Player(int Hp, int Level, int Protection, int Exp, String name, int power) {
        super(name, power);
        this.Exp = Exp;
        this.Hp = Hp;
        this.Level = Level;
        this.Protection = Protection;
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

    public boolean BuyersAssessment(Weapon artifact) {
        return Level >= artifact.Level;
    }
}

public class Enemy extends GameObject {
    int Hp;
    int Protection;
    Enemy(int Hp,int Protection,String name,int Power){
        super(name,Power);
        this.Hp=Hp;
        this.Protection=Protection;
    }
    public int getProtection(){
        return this.Protection;
    }
    public int getHp(){
        return this.Hp;
    }
}

public class Weapon extends GameObject {
    float Coast;
    int Level;
    Weapon(float Coast,String name,int Power,int Level){
        super(name,Power);
        this.Coast=Coast;
        this.Level=Level;
    }
    public float getCoast(){
        return this.Coast;
    }
    public int getLevel(){
        return this.Level;
    }
}

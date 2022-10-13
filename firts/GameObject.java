
public class GameObject {
    protected String name;
    protected int power;
    GameObject(String name,int power){
               this.name=name;
               this.power=power;
    }
    protected String getName(){
        return this.name;
    }
    protected int getPower(){
        return this.power;
    }

}

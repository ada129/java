//порождает все предметы в игре
public  abstract class GameObject {
    protected final int id;
    protected String name;
    GameObject(int id,String name){
               this.id=id;
               this.name=name;
    }
    protected String getName(){
        return this.name;
    }
    protected int getId(){
        return this.id;
    }

}

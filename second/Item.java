//предметы игрока
public class Item extends GameObject {
    float Coast;
    Item(float Coast,String name,int id){
        super(id,name);
        this.Coast=Coast;
    }
    public float getCoast(){
        return this.Coast;
    }
}

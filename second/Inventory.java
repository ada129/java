import java.util.ArrayList;
//то чем владеет игрок
public class Inventory extends Item{
      ArrayList<Item> inventory;
      Inventory(int id,String name,float coast){
          super(coast,name ,id);
          this.inventory=new ArrayList<>();
      }

}

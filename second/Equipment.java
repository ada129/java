import java.util.ArrayList;
//экиперовака на себе игрока
public class Equipment extends Item {
  int level;
  int power;
  Equipment(String name,float coast, int id,int power,int level){
          super(coast,name,id);
          this.level=level;
          this.power=power;

  }
}

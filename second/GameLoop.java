import java.util.ArrayList;
import java.util.Random;

public class GameLoop {
            ArrayList<Mob> mobs;
            GameLoop(){
              Random random =new Random();
              for (int i=0;i<random.nextInt(3)+1;i++){
                  this.mobs.add(new Mob(
                      random.nextInt(20)+10,
                      random.nextInt(10)+5,
                        "Mob"+random.nextInt(),
                      random.nextInt(20)+2,
                      random.nextInt(10)+14
                  )
                  );
              }
            }
            public boolean play(Player player){
              int i=0;
              while (player.Hp>0 && this.mobs.size()!=0){
                    if (i%2==0){
                        GameLogic.fight(player,this.mobs.get(0));
                    }else {
                        GameLogic.fight(this.mobs.get(0),player);
                    }
                    if (this.mobs.get(0).Hp<=0){
                        this.mobs.get(0).dropLoot();
                        this.mobs.remove(0);
                    }
                    i++;
              }
              return mobs.size()==0;
            }
}

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String arg[]){
        Random random=new Random();
        ArrayList<Player> players=new ArrayList<>();
        ArrayList<Enemy> enemies=new ArrayList<>();
        int leftLimit=97;
        int rightLimit=122;
        int targetStringLength=10;
        for (int i=0;i<10;i++){
            String generatedString = random.ints(leftLimit, rightLimit + 1)
                    .filter(j -> (j >= 97))
                    .limit(targetStringLength)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
            players.add(new Player(random.nextInt(50),
                                   random.nextInt(100),
                                   random.nextInt(100),
                                   random.nextInt(100),
                                   generatedString,
                                   random.nextInt(100)));
            enemies.add(new Enemy(random.nextInt(50),
                                  random.nextInt(100),
                                  generatedString,
                                  random.nextInt(100) ));
        }
        for (Player player:players){
             System.out.println("Имя игрока:"+player.name+' '+
                                "Сила:"+player.power+' '+
                                "Здровье:"+player.Hp+' '+
                                "Уровень:"+player.Level+' '+
                                "Защита:"+player.Protection+' '+
                                "Опыт:"+player.Exp);
        }
        for (Enemy enemy:enemies){
            System.out.println("Имя врага:"+enemy.name+' '+
                               "Сила:"+enemy.power+' '+
                               "Здровье:"+enemy.Hp+' '+
                               "Защита:"+enemy.Protection);
        }
    }
}

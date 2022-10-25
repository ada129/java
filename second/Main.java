import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String arg[]){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        System.out.println("Начало игры:Введите имя");
        Player player=new Player(random.nextInt(60)+10,
            1,
            random.nextInt(20)+30,
            0,
            scanner.next(),
            random.nextInt(15)+10,
            random.nextInt(10)+20);
        GameLoop start=new GameLoop();
        System.out.println(start.play(player)?"Выйгрыш":"проигрыш");
    }
}

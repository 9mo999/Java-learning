package ifDemo;
import java.util.Scanner;

public class ifDemo2 {
    public static void main(String[] arge) {
        Scanner sc = new Scanner(System.in);
        double life = 200;
        System.out.println("请输入受到的伤害");
        double hurt = sc.nextDouble();

        System.out.println("请输入技能恢复的血量");
        double recover = sc.nextDouble();
        if (life-hurt+recover>=1 && life-hurt+recover<=200) {
            System.out.println("最终人物的生命值为"+(life-hurt+recover));

        } else if (life-hurt+recover>200) {
            System.out.println("最终人物的血量为"+200);
        } else{
            System.out.println("最终人物的生命值为"+1);
        }



    }

}

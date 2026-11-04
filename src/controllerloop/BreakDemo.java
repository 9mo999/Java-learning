package controllerloop;
import java.util.Scanner;


public class BreakDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double damage = 0;
        while(true){
            System.out.println("请输入角色受到的伤害：");
            if(!sc.hasNextDouble()) {
                System.out.println("输入的不是数字");
                sc.next();
                continue;
            }
            damage = sc.nextDouble();
            if(damage > 0) break;
            else System.out.println("受到的伤害不能是负数或零");
        }
        double recover = 0;
        while(true){
            System.out.println("请输入角色技能恢复的血量：");
            if(!sc.hasNextDouble()) {
                System.out.println("输入的不是数字");
                sc.next();
                continue;
            }
            recover = sc.nextDouble();
            if(recover > 0) break;
            else System.out.println("恢复的血量不能是负数或零");
        }
        double life = 200;
        if(damage > life+recover){
            System.out.println("角色最终血量为1");
        }else if(recover>damage){
            System.out.println("角色最终血量为200");
        }else{
            System.out.println("角色最终血量为"+(life-damage+recover));
    }

}}

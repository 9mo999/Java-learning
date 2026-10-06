package ppp;

public class yyy {
    public static void main(String[] args) {
        //1.定义变量记录我方攻击力
        int attack = 220;


        //定义变量记录我方防御力
        int defense = 100;

        //定义变量记录我方生命值
        int hp = 1000;

        //定义变量记录我方技能加成
        double skill = 1.2;

        //定义变量记录对方的攻击力
        int attack2 = 200;

        //定义变量记录对方的防御力
        int defense2 = 80;

        //定义变量记录对方的生命值
        int hp2 = 1200;

        //定义变量记录对方的技能加成
        double skill2 = 1.1;

        //我方第一次普通攻击，造成多少伤害，对方还剩多少血量？
        //普攻造成伤害=攻击力-对方防御力
        int damage = attack - defense2;
        hp2 = hp2 - damage;
        System.out.println(hp2);

        //我方第二次进行技能攻击，造成多少伤害，对方还剩多少血量？
        damage = (int)(attack * skill - defense2);
        hp2 = hp2 - damage;
        System.out.println(hp2);
    }
}

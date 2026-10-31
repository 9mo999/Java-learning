package ifDemo;
import java.util.Scanner;


public class ifDemo10 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入充值金额：");
            if(!sc.hasNextDouble()) {
                System.out.println("输入的充值金额有误");
                return;
            } double recharge = sc.nextDouble();
            if (recharge < 0) {
                System.out.println("输入的充值金额有误");
                return;
            }double bonus = 0;
            if (recharge >= 50000)      bonus = 15000;
            else if (recharge >= 20000)      bonus = 6000;
            else if (recharge >= 10000)      bonus = 2500;
            else if (recharge >= 5000)       bonus = 1300;
            else if (recharge >= 3000)       bonus = 700;
            else if (recharge >= 2000)       bonus = 500;
            else if (recharge >= 1000)       bonus = 200;
            else bonus = 0;
            System.out.println("充值的金额为："+recharge);
            System.out.println("充值送的金额为："+bonus);
            System.out.println("充值后的金额为："+(recharge+bonus));
        }
}

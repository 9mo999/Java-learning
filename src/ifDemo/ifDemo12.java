package ifDemo;
import java.util.Scanner;


public class ifDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的实际用电量：");
        if(!sc.hasNextDouble()) {
            System.out.println("输入的用电量有误");
            return;
        }
        double electricity = sc.nextDouble();
        if(electricity < 0) {
            System.out.println("输入的用电量有误");
            return;
        }
        if(electricity <= 100) {
            System.out.println("您的电费为：" + electricity * 0.5 + "元");
        } else if(electricity <= 200) {
            System.out.println("您的电费为：" + ((electricity-100) * 0.8 + 100 * 0.5) + "元");
        } else {
            System.out.println("您的电费为：" + ((electricity-200) * 1.2 + 100 * 0.8 + 100 * 0.5) + "元");
        }
    }
}

package ifDemo;
import java.util.Scanner;


public class ifDemo1 {
    public static void main (String[] arge) {
        Scanner sc = new Scanner (System.in);
        System.out.println("请输入您的体温");
        double temperature = sc.nextDouble();
        if (temperature >= 38) {
            System.out.println("您可能发烧了");
        }
        else {
            System.out.println("您正常");
        }
    }
}

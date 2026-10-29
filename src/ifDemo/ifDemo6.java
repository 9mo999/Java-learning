package ifDemo;
import java.util.Scanner;


public class ifDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数n（1-100）：");
        double n = sc.nextDouble();
        if (n%1!=0) {
            System.out.println("输入的数字不是整数");
            return;
        }
        if (n<1||n>100) {
            System.out.println("输入的数字不在1-100之间");
            return;
        }
        if (n>50 && n%2==0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

}

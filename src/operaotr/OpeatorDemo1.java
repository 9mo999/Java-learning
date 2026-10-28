package operaotr;
import java.util.Scanner;


public class OpeatorDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        int num1 = num/3600;
        int num2 = (num%3600)/60;
        int num3 = num%60;
        System.out.println(num1 + "小时" + num2 + "分钟" + num3 + "秒");
    }

}

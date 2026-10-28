package operaotr;
import java.util.Scanner;


public class OpeatorDemo {
    public static void main(String[] arge) {
        Scanner sc = new Scanner (System.in);
        System.out.println("请输入一个三位数");
        int num = sc.nextInt();
        int hundreds = num / 100;
        int tens = (num / 10) % 10;
        int units = num % 10;
        System.out.println(" 百位是 " + hundreds);
        System.out.println(" 十位是 " + tens);
        System.out.println(" 个位是 " + units);




    }
}

package controllerloop;
import java.util.Scanner;


public class BreakDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while(true) {
            System.out.println("请输入一个大于等于2的整数：");
            if(!sc.hasNextInt()) {
                System.out.println("输入的不是整数");
                sc.next();
                continue;
            }
            num = sc.nextInt();
            if(num >= 2) break;
            else System.out.println("输入的整数小于2");
        }
        // 只需判断到 sqrt(num)：若 num = a*b，则 a、b 中必有一个不大于 sqrt(num)
        boolean isPrime = true;
        for(int j = 2; j * j <= num; j++) {
            if(num % j == 0) {
                isPrime = false;
                break; // 找到因子说明不是质数，无需继续判断
            }
        }
        if(isPrime) {
            System.out.println(num + "是质数");
        } else {
            System.out.println(num + "不是质数");
        }

    }
}

package loopwhile;
import java.util.Scanner;


public class WhileDemo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        if(!scanner.hasNextInt()) {
            System.out.println("输入的不是整数");
            return;
        }
        int num = scanner.nextInt();
        if(num < 0){
            num = Math.abs(num);
        }
        int num1 = 0;

        while(num != 0) {
            num1 = num1+num % 10;
            num = num / 10;


        }System.out.println("各位数字之和为：" + num1);
    }
}

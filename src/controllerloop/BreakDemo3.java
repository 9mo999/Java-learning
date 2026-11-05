package controllerloop;
import java.util.Scanner;

public class BreakDemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (true) {
            System.out.print("请输入一个整数n(1<=n<=10^5)：");
            while (!scanner.hasNextInt()) {
                System.out.print("输入无效，请重新输入：");
                scanner.next();
                continue;
            }
            num = scanner.nextInt();
            if (num < 1 || num > 100000) {
                System.out.println("您输入的数字不符合要求");
                continue;
            }else break;
        } int count = 0;
        for(int i = 1; i <= num; i++){
            if(i%4==0||i%10==4||i/10%10==4) continue;
            System.out.printf("%-5d", i);
            if(++count%10==0) System.out.println();
        }
    }
}

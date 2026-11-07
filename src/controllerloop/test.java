package controllerloop;
import java.util.*;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random r = new Random();
        int num1 = r.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字(1-100)：");
        while(true){
            int num = 0;
            while (true) {
                if (!scanner.hasNextInt()) {
                    System.out.println("输入无效，请重新输入一个数字(1-100)：");
                    scanner.next();
                    continue;
                } else {
                    num = scanner.nextInt();
                    if (num < 1 || num > 100) {
                        System.out.println("输入无效，请重新输入一个数字(1-100)：");
                        continue;
                    }
                    break;
                }}
            if(num == num1){
                System.out.println("恭喜你，猜对了！");
                break;
            }
            else if (num > num1) System.out.println("很遗憾，猜错了！您的数字偏大，请重新输入一个数字(1-100)：");
            else  System.out.println("很遗憾，猜错了！您的数字偏小，请重新输入一个数字(1-100)：");
        }}}

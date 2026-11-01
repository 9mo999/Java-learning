package switchdemo;
import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份：");
        if(!sc.hasNextInt()) {
            System.out.println("输入的月份有误");
            return;
        }
        int month = sc.nextInt();
        switch (month) {
            case 1,2,12 -> System.out.println("冬季");
            case 3,4,5 -> System.out.println("春季");
            case 6,7,8 -> System.out.println("夏季");
            case 9,10,11 -> System.out.println("秋季");
            default -> System.out.println("输入的月份有误");
        }

    }
}

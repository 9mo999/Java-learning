package switchdemo;
import java.util.Scanner;


public class SwitchDemo1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入今天是周几：");
        if(!sc.hasNextInt()) {
            System.out.println("输入的日期有误");
            return;
        }
        int week = sc.nextInt();
        if (week < 1 || week > 7){
            System.out.println("输入的日期有误");
            return;
        }
        switch (week){
            case 1:
                System.out.println("今天跑步");
                break;
            case 2:
                System.out.println("今天游泳");
                break;
            case 3:
                System.out.println("今天慢走");
                break;
            case 4:
                System.out.println("今天骑动感单车");
                break;
            case 5:
                System.out.println("今天拳击");
                break;
            case 6:
                System.out.println("今天爬山");
                break;
            case 7:
                System.out.println("今天好好吃一顿7");
                break;
        }

    }
}

package ifDemo;
import java.util.Scanner;


public class ifDemo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入坐标x的值：");
        if(!sc.hasNextDouble()) {
            System.out.println("输入的x的值有误");
            return;
        }
        double x = sc.nextDouble();
        System.out.println("请输入坐标y的值：");
        if(!sc.hasNextDouble()) {
            System.out.println("输入的y的值有误");
            return;
        }
        double y = sc.nextDouble();
        if(x > 0 && y > 0) System.out.println("点(" + x + "," + y + ")在第一象限");
         else if(x < 0 && y > 0) System.out.println("点(" + x + "," + y + ")在第二象限");
         else if(x < 0 && y < 0) System.out.println("点(" + x + "," + y + ")在第三象限");
         else if(x > 0 && y < 0)System.out.println("点(" + x + "," + y + ")在第四象限");
         else if(x == 0 && y != 0)System.out.println("点(" + x + "," + y + ")在y轴上");
         else if(x != 0 && y == 0)System.out.println("点(" + x + "," + y + ")在x轴上");
         else System.out.println("点(" + x + "," + y + ")在原点");


    }

}

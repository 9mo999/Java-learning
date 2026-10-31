package ifDemo;
import java.util.Scanner;


public class ifDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个数字，判断是否能构成三角形");
        System.out.println("请输入第一个数字");
        if(!sc.hasNextDouble()) {
            System.out.println("输入的第一个数字有误");
            return;
        }
        double a = sc.nextDouble();
        System.out.println("请输入第二个数字");
        if(!sc.hasNextDouble()) {
            System.out.println("输入的第二个数字有误");
            return;
        }
        double b = sc.nextDouble();
        System.out.println("请输入第三个数字");
        if(!sc.hasNextDouble()) {
            System.out.println("输入的第三个数字有误");
            return;
        }
        double c = sc.nextDouble();
        boolean isTriangle = a+b>c&&a+c>b&&b+c>a;
        if (!isTriangle)System.out.println("不能构成三角形");
        if (a == b && b == c && a == c) System.out.println("构成等边三角形");
        else if ((a == b || b == c || a == c)&&(a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a))System.out.println("构成等腰直角三角形");
        else if (a == b || b == c || a == c)System.out.println("构成等腰三角形");
        else if (a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a)
            System.out.println("构成直角三角形");
        else
            System.out.println("构成普通三角形");



}}

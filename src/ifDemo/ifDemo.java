package ifDemo;
import java.util.Scanner;


public class ifDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        double num = sc.nextDouble();
        if (num%1!=0){
            System.out.println("您输入的数字不是整数");
            return;
        }
        if (num<=0){
            System.out.println("您输入的数字不是正整数");
            return;
        }
         if (num%2==0){
            num = num/2;
        } else {
            num = num*3+1;
        }
        System.out.println("结果是"+num);

    }


}

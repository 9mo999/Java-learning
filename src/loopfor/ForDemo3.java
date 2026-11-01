package loopfor;
import java.util.Scanner;

public class ForDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        if(!sc.hasNextDouble()) {
            System.out.println("输入的数字有误");
            return;
        }
        double num = sc.nextDouble();
        int num3 = (int) num;
        System.out.println("请输入第二个数字");
        if(!sc.hasNextDouble()) {
            System.out.println("输入的数字有误");
            return;
        }
        double num2 = sc.nextDouble();
        int num4 = (int) num2;
        int j = 0;
        if(num3 < num4){
            for(int i = num3; i <= num4; i++){
            if(i%3 == 0 && i%5 == 0){
                j++;}
        }}else {
            for(int i = num4; i <= num3; i++){
                if(i%3 == 0 && i%5 == 0){
                j++;}
            }
        }
        System.out.println("两个数字之间的整数个数为：" + j);


    }

}

package loopfor;
import java.util.Scanner;


public class ForDemo4 {
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
        int min = num3 < num4 ? num3 : num4;
        int max = num3 > num4 ? num3 : num4;
        for(int i = min; i <= max; i++) {
            if(i%3 == 0 && i%5 == 0){
            j += 1;
        }
    }
        if(j != 0) {
            System.out.println("在" + min + "到" + max + "之间能同时被3和5整除的数有：" + j+"个");
        }else {
            System.out.println("在" + min + "到" + max + "之间没有能同时被3和5整除的数");
        }
}}

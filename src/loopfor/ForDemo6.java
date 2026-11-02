package loopfor;
import java.util.Scanner;


public class ForDemo6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第几项");
        if (!sc.hasNextInt()) {
            System.out.println("输入的项数有误");
            return;
        }
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0)  sum -= i;
            else  sum += i;
        }
        System.out.println("第" + num + "项的和是" + sum);
    }}
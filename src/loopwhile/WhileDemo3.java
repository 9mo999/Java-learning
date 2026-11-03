package loopwhile;
import java.util.Scanner;


public class WhileDemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入纸张厚度（毫米）：");
        if(!scanner.hasNextDouble()) {
            System.out.println("输入的纸张厚度有误");
            return;
        }
        double thickness = scanner.nextDouble();
        double zblmf = 8848.86;
        int i = 0;
        while(thickness < (zblmf*1000)) {
            thickness *= 2;
            i++;
        }   System.out.println("需要折叠" + i + "次才能超过珠穆朗玛峰");


    }
}

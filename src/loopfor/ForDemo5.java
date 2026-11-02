package loopfor;
import java.util.Scanner;


public class ForDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要查询的项数");
        if(!sc.hasNextInt()) {
            System.out.println("输入的项数有误");
            return;
        }
        int num = sc.nextInt();
        int sum = 0;
        int sum2 = 1;
        int sum3 = 0;
        if(num>=3){
        for(int i = 3; i <= num; i++){
            sum3 = sum2 + sum;
            sum = sum2;
            sum2 = sum3;
        }}else if(num==1){
            sum3 = 0;
        }else if(num==2){
            sum3 = 1;
        }System.out.println("第"+num+"项是"+sum3);



    }

}

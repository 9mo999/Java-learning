package operaotr;
import java.util.Scanner;


public class OpeatorDemo2 {
    public static void main(String[] args) {
        short a = 100;
        short b = 200;
        byte c = (byte)(a + b);
        System.out.println(c);


        byte d = 10;
        short e = 800;
        double f = 3.1415926;
        double g = d + e + f;
        System.out.println(g);

        char h = 'A';
        char h1 = (char)(h + 32);
        System.out.println(h1);
        System.out.println("-------------------------------------------");


        int i = 10;
        int j = 20;
        i += j;
        System.out.println(i);
        i -= j;
        System.out.println(i);
        i *= j;
        System.out.println(i);
        i /= j;
        System.out.println(i);
        i %= j;
        System.out.println(i);
        i++;
        System.out.println(i);
        i--;
        System.out.println(i);

        System.out.println("-------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的身高");
        double height = sc.nextDouble();
        System.out.println("请输入您朋友的身高");
        double friendHeight = sc.nextDouble();
        boolean result = height >= friendHeight;
        System.out.println(result);

        System.out.println("请输入一个3位数");
        int number = sc.nextInt();
        boolean result2 = number%3 == 0;
        System.out.println(result2);

        System.out.println("-------------------------------------------");
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        boolean result3 = num>=1 & num<=10;
        System.out.println(result3);
        System.out.println("请输入一个整数");
        int num2 = sc.nextInt();
        boolean result4 = num2<=1 & num2>=10;
        System.out.println(!result4);


        System.out.println("-------------------------------------------");

        System.out.println("请输入一个四位数");
        int num3 = sc.nextInt();
        boolean result5 = num3/1000%10 == num3%10 && num3/100%10 == num3/10%10;
        System.out.println(result5);
        System.out.println("-------------------------------------------");
        System.out.println("请输入一个两位数");
        int num4 = sc.nextInt();
        boolean result6 = num4%7 == 0 || num4%10 == 7 || num4/10%10 == 7;
        System.out.println(result6);
        System.out.println("-------------------------------------------");
        System.out.println("请输入一个整数");
        int num5 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int num6 = sc.nextInt();
        System.out.println(num5 > num6 ? "num5" : "num6");









    }

}

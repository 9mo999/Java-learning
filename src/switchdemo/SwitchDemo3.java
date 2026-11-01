package switchdemo;
import java.util.Scanner;



public class SwitchDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        if(!sc.hasNextDouble()) {
            System.out.println("输入的数字有误");
            return;
        }
        double num = sc.nextDouble();
        System.out.println("请输入运算符");
        char operator = sc.next().charAt(0);
        if(operator != '+' && operator != '-' && operator != '*' && operator != '/') {
            System.out.println("输入的运算符有误");
            return;
        }
        System.out.println("请输入数字");
        if(!sc.hasNextDouble()){
            System.out.println("输入的数字有误");
            return;
        } double num2 = sc.nextDouble();
        if(num2 == 0&&operator == '/'){
            System.out.println("除数不能为0");
            return;
        }double result = switch (operator){
            case '+' -> num + num2;
            case '-' -> num - num2;
            case '*' -> num * num2;
            case '/' -> num / num2;
            default -> 0;
        };
        System.out.println("结果是：" + result);

    }
}

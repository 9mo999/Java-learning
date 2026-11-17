package controllerloop;
import java.util.Scanner;


public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择图形：\nA.平行四边形\nB.梯形\nC.菱形");
        String choice = sc.next();
        while (!choice.equals("A") && !choice.equals("B") && !choice.equals("C")) {
            System.out.print("输入无效，请重新输入：");
            choice = sc.next();
        }
        if (choice.equals("A")) {
            System.out.println("请选择平行四边形的绘制方式：\nA.正平行四边形\nB.倒平行四边形");
            String choice2 = sc.next();
            while (!choice2.equals("A") && !choice2.equals("B")) {
                System.out.print("输入无效，请重新输入：");
                choice2 = sc.next();
            }
            System.out.println("请输入底边长度(大于0的整数)：");
            while(!sc.hasNextInt()) {
                System.out.print("输入无效，请重新输入：");
                sc.next();
            }
            int base = sc.nextInt();
            while (base <= 0) {
                System.out.print("输入无效，请重新输入：");
                base = sc.nextInt();
            }
            System.out.println("请输入高(大于0的整数)：");
            while(!sc.hasNextInt()) {
                System.out.print("输入无效，请重新输入：");
                sc.next();
            }
            int height = sc.nextInt();
            while (height <= 0) {
                System.out.print("输入无效，请重新输入：");
                height = sc.nextInt();
            }
            if (choice2.equals("A")) {
                for(int i = 0; i < height; i++){
                    for(int j = i; j < height - 1; j++){
                        System.out.print(" ");
                    }
                    for(int k = 0; k < base; k++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            } else {
                for(int i = 0; i < height; i++){
                    for(int j = 0; j < i; j++){
                        System.out.print(" ");
                    }
                    for(int k = 0; k < base; k++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
        } else if (choice.equals("B")) {
            System.out.println("请选择梯形的绘制方式：\nA.正梯形\nB.倒梯形");
            String choice2 = sc.next();
            while (!choice2.equals("A") && !choice2.equals("B")) {
                System.out.print("输入无效，请重新输入：");
                choice2 = sc.next();
            }
            System.out.println("请输入下底长度(大于4的整数)：");
            while(!sc.hasNextInt()) {
                System.out.print("输入无效，请重新输入：");
                sc.next();
            }
            int base1 = sc.nextInt();
            while (base1 <= 4) {
                System.out.print("输入无效，请重新输入：");
                base1 = sc.nextInt();
            }
            System.out.println("请输入高(大于0且小于等于下底长度一半的整数)：");
            while(!sc.hasNextInt()) {
                System.out.print("输入无效，请重新输入：");
                sc.next();
            }
            int height = sc.nextInt();
            while (height <= 0 || height > base1 / 2) {
                System.out.print("输入无效，请重新输入：");
                height = sc.nextInt();
            }
            if (choice2.equals("A")) {
                int b = base1-(base1-1)*2;
                for(int i = 0; i < height; i++){
                    for(int j = i; j < height - 1; j++){
                        System.out.print(" ");
                    }
                    for(int k = 0; k < b; k++){
                        System.out.print("*");
                    }
                    b += 2;
                    System.out.println();
                }
            } else {
                for(int i = 0; i < height; i++){
                    for(int j = 0; j < i; j++){
                        System.out.print(" ");
                    }
                    for(int k = 0; k < base1; k++){
                        System.out.print("*");
                    }
                    base1 -= 2;
                    System.out.println();
                }
            }
        }
    }
}

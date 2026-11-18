package controllerloop;
import java.util.Scanner;


public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择图形：\nA.平行四边形\nB.梯形\nC.空心四边形\nD.菱形");
        String choice = sc.next();
        while (!choice.equals("A") && !choice.equals("B") && !choice.equals("C") && !choice.equals("D")) {
            System.out.print("输入无效，请重新输入：");
            choice = sc.next();
        }
        switch (choice) {
            case "A":
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
                    for(int j = i; j < height - 1; j++)System.out.print(" ");
                    for(int k = 0; k < base; k++)System.out.print("* ");
                    System.out.println();
                }
            } else {
                for(int i = 0; i < height; i++){
                    for(int j = 0; j < i; j++)System.out.print(" ");
                    for(int k = 0; k < base; k++)System.out.print("* ");
                    System.out.println();
                }
            }break;
        case "B":
            System.out.println("请选择梯形的绘制方式：\nA.正梯形\nB.倒梯形");
            String choice3 = sc.next();
            while (!choice3.equals("A") && !choice3.equals("B")) {
                System.out.print("输入无效，请重新输入：");
                choice3 = sc.next();
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
            int height1 = sc.nextInt();
            while (height1 <= 0 || height1 > base1 / 2) {
                System.out.print("输入无效，请重新输入：");
                height1 = sc.nextInt();
            }
            if (choice3.equals("A")) {
                int b = base1-(height1-1)*2;
                for(int i = 0; i < height1; i++){
                    for(int j = i; j < height1 - 1; j++)System.out.print(" ");
                    for(int k = 0; k < b; k++)System.out.print("*");
                    b += 2;
                    System.out.println();
                }
            } else {
                for(int i = 0; i < height1; i++){
                    for(int j = 0; j < i; j++)System.out.print(" ");
                    for(int k = 0; k < base1; k++)System.out.print("*");
                    base1 -= 2;
                    System.out.println();
                }
            }
        break;
        case "C":
            System.out.println("请输入边长（大于0的整数）：");
            while(!sc.hasNextInt()) {
                System.out.print("输入无效，请重新输入：");
                sc.next();
            }
            int side = sc.nextInt();
            while (side <= 0) {
                System.out.print("输入无效，请重新输入：");
                side = sc.nextInt();
            }for (int i = 0; i < side; i++) {
                for (int j = 0; j < side; j++) {
                    if (i == 0 || i == side - 1 || j == 0 || j == side - 1) System.out.print("* ");
                    else System.out.print("  ");
                }
                System.out.println();
            }
        break;
        case "D":
            System.out.println("请选择菱形的绘制方式：\nA.实心菱形\nB.空心菱形");
            String choice4 = sc.next();
            while (!choice4.equals("A") && !choice4.equals("B")) {
                System.out.print("输入无效，请重新输入：");
                choice4 = sc.next();
            }
            System.out.println("请输入边长（大于0的整数）：");
            while(!sc.hasNextInt()) {
                System.out.print("输入无效，请重新输入：");
                sc.next();
            }
            int side2 = sc.nextInt();
            while (side2 <= 0) {
                System.out.print("输入无效，请重新输入：");
                side2 = sc.nextInt();
            }
            if (choice4.equals("A")) {
                int a = 1;
                for (int i = 0; i < side2; i++){
                    for (int j = 0; j < side2-1-i; j++)System.out.print(" ");
                    for (int j = 0; j < a; j++)System.out.print("*");
                    a+=2;
                    System.out.println();
                }
                for (int i = 0; i < side2-1; i++){
                    for (int j = 0; j < i+1; j++)System.out.print(" ");
                    for (int k = 0; k < (side2-1-i)*2-1; k++)System.out.print("*");
                    System.out.println();
                }
            } else {
                int a = 1;
                for (int i = 0; i < side2; i++){
                    for (int j = 0; j < side2-1-i; j++)System.out.print(" ");
                    for (int k = 0; k < a; k++){
                        if (k==0||k==a-1) System.out.print("*");
                        else System.out.print(" ");
                    }
                    a+=2;
                    System.out.println();
                }
                for (int i = 0; i < side2-1; i++){
                    for (int j = 0; j < i+1; j++)System.out.print(" ");
                    int w = (side2-1-i)*2 - 1;
                    for (int k = 0; k < w; k++){
                        if (k==0||k==w-1) System.out.print("*");
                        else System.out.print(" ");
                    }
                    System.out.println();
                }
            }
        }
        System.out.println("请问是否继续运行？\nA.继续\nB.退出");
        String choice5 = sc.next();
        while (!choice5.equals("A") && !choice5.equals("B")) {
            System.out.print("输入无效，请重新输入：");
            choice5 = sc.next();
        }
        if (choice5.equals("A")) {
            main(args);
        } else {
            System.out.println("程序已退出");
        }
    }
}

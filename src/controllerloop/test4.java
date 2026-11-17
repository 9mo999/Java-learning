package controllerloop;
import java.util.Scanner;


public class test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择图形：\nA.正三角形\nB.倒三角形");
        String choice = scanner.next();
        while (!choice.equals("A") && !choice.equals("B")) {
            System.out.print("输入无效，请重新输入：");
            choice = scanner.next();
        }
        System.out.print("请输入一个边长（大于0的整数）：");
        int i = 0;
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.print("输入无效，请重新输入边长（大于0的整数）： ");
                scanner.next();
            }else {
                i = scanner.nextInt();
                if (i > 0) break;
                else System.out.print("输入无效，请重新输入边长（大于0的整数）： ");
            }
        }

        if (choice.equals("B")) {
            int j = i;
            for (int n = 0; n < i; n++) {
                for (int k = 0; k < j; k++) {
                    System.out.print("*");
                    if (k < j - 1) System.out.print("  ");
                }
                j--;
                System.out.println();
            }
        }else{
            int j = 1;
            for (int n = 0; n < i; n++) {
                for (int k = 0; k < j; k++) {
                    System.out.print("*");
                    if (k < j - 1) System.out.print("  ");
                }
                j++;
                System.out.println();
            }
        }
    }
}



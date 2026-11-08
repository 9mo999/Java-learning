package controllerloop;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入长度（大于0的整数）： ");
        int length = 0;
        int width = 0;
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.print("输入无效，请重新输入长度（大于0的整数）： ");
                scanner.next();
            }else {
                length = scanner.nextInt();
                if (length > 0) break;
                else System.out.print("输入无效，请重新输入长度（大于0的整数）： ");
            }
        }
        System.out.print("请输入宽度（大于0的整数）： ");
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.print("输入无效，请重新输入宽度（大于0的整数）： ");
                scanner.next();
            }else {
                width = scanner.nextInt();
                if (width > 0) break;
                else System.out.print("输入无效，请重新输入宽度（大于0的整数）： ");
            }
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
                if (j < width - 1) System.out.print("  ");
            }
            System.out.println();
        }
    }
}

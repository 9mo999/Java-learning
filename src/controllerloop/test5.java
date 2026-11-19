package controllerloop;

import java.util.Scanner;

public class test5 {
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("请选择图形：\nA.平行四边形\nB.梯形\nC.空心四边形\nD.菱形");
            switch (readChoice("ABCD")) {
                case "A" -> drawParallelogram();
                case "B" -> drawTrapezoid();
                case "C" -> drawHollowSquare();
                case "D" -> drawDiamond();
            }
            System.out.println("\n请问是否继续运行？\nA.继续\nB.退出");
        } while (readChoice("AB").equals("A"));
        System.out.println("程序已退出");
        SC.close();
    }

    /* ================= 输入工具：所有校验都收敛到这两个方法，绝不崩溃 ================= */

    /** 读取一个选项：只接受 valid 中的单个字符（不区分大小写，统一返回大写） */
    private static String readChoice(String valid) {
        if (!SC.hasNext()) exitOnEof();
        String s = SC.next().trim().toUpperCase();
        while (s.length() != 1 || valid.indexOf(s.charAt(0)) < 0) {
            System.out.print("输入无效，请重新输入：");
            s = SC.next().trim().toUpperCase();
        }
        return s;
    }

    /** 读取一个落在 [min, max] 区间的整数：非数字、太小、太大一律重试 */
    private static int readInt(String prompt, int min, int max) {
        System.out.println(prompt);
        while (true) {
            if (!SC.hasNext()) exitOnEof();
            if (SC.hasNextInt()) {
                int v = SC.nextInt();
                if (v >= min && v <= max) return v;
            } else {
                SC.next(); // 丢弃非法输入
            }
            System.out.print("输入无效，请重新输入：");
        }
    }

    /** 输入流已结束（Ctrl+Z / 管道耗尽）：优雅退出，避免 NoSuchElementException */
    private static void exitOnEof() {
        System.out.println("\n输入结束，程序退出");
        SC.close();
        System.exit(0);
    }

    private static int readInt(String prompt, int min) {
        return readInt(prompt, min, Integer.MAX_VALUE);
    }

    /* ================= 绘图工具 ================= */

    /** 打印一行：spaces 个空格 + stars 个星号；hollow 为 true 时只画首尾两个星号 */
    private static void printRow(int spaces, int stars, boolean hollow) {
        for (int j = 0; j < spaces; j++) System.out.print(" ");
        for (int k = 0; k < stars; k++) {
            System.out.print(!hollow || k == 0 || k == stars - 1 ? "*" : " ");
        }
        System.out.println();
    }

    private static void drawParallelogram() {
        System.out.println("请选择平行四边形的绘制方式：\nA.正平行四边形\nB.倒平行四边形");
        boolean upright = readChoice("AB").equals("A");
        int base = readInt("请输入底边长度(大于0的整数)：", 1);
        int height = readInt("请输入高(大于0的整数)：", 1);
        for (int i = 0; i < height; i++) {
            // 正：第 0 行在最右、逐行左移；倒：第 0 行在最左、逐行右移
            printRow(upright ? height - 1 - i : i, base, false);
        }
    }

    private static void drawTrapezoid() {
        System.out.println("请选择梯形的绘制方式：\nA.正梯形\nB.倒梯形");
        boolean upright = readChoice("AB").equals("A");
        int base = readInt("请输入下底长度(大于4的整数)：", 5);
        int height = readInt("请输入高(大于0且小于等于下底长度一半的整数)：", 1, base / 2);
        for (int i = 0; i < height; i++) {
            int spaces = upright ? height - 1 - i : i;
            // 正梯形：顶行最窄 base-(height-1)*2，每行加 2；倒梯形：顶行就是 base，每行减 2
            int stars = upright ? base - (height - 1 - i) * 2 : base - i * 2;
            printRow(spaces, stars, false);
        }
    }

    private static void drawHollowSquare() {
        int side = readInt("请输入边长（大于0的整数）：", 1);
        for (int i = 0; i < side; i++) {
            boolean isBorderLine = i == 0 || i == side - 1;
            printRow(0, side, !isBorderLine);
        }
    }

    private static void drawDiamond() {
        System.out.println("请选择菱形的绘制方式：\nA.实心菱形\nB.空心菱形");
        boolean solid = readChoice("AB").equals("A");
        int side = readInt("请输入边长（大于0的整数）：", 1);
        // 上半部分（含最长行）：第 i 行 = (side-1-i) 个空格 + (2i+1) 个星号
        for (int i = 0; i < side; i++) printRow(side - 1 - i, 2 * i + 1, !solid);
        // 下半部分：与上半部分第 0 ~ side-2 行完全对称
        for (int i = side - 2; i >= 0; i--) printRow(side - 1 - i, 2 * i + 1, !solid);
    }
}

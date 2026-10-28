package zzz;

import java.util.Scanner;

public class VariableDemo7 {
    public static void main(String[] args) {
        System.out.println("请输入您的身高");
        Scanner sc = new Scanner (System.in);
        double height = sc.nextDouble();
        System.out.println("请输入您的体重");
        double weight = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("您的BMI指数为：" + bmi);

    }
}

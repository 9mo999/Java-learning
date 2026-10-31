package ifDemo;
import java.util.Scanner;


public class ifDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的身高（米）：");
        if(!sc.hasNextDouble()) {
            System.out.println("输入的身高有误");
            return;
        }double height = sc.nextDouble();
        if(height < 0) {
            System.out.println("输入的身高有误");
            return;
        }
        System.out.println("请输入您的体重（千克）：");
        if(!sc.hasNextDouble()) {
            System.out.println("输入的体重有误");
            return;
        }double weight = sc.nextDouble();
        if(weight < 0) {
            System.out.println("输入的体重有误");
            return;
        }
        double bmi = weight / (height * height);
        System.out.printf("您的BMI指数为：%.2f", bmi);
        if(bmi < 18.5) System.out.println(" 身体状态：消瘦 "+"健康风险：部分增加");
        else if(bmi >= 18.5 && bmi <= 23.9) System.out.println(" 身体状态：正常 "+"健康风险：正常");
        else if(bmi >= 24 && bmi <= 26.9)System.out.println(" 身体状态：偏胖 "+"健康风险：增加");
        else if(bmi >= 27 && bmi <= 29.9)System.out.println(" 身体状态：肥胖 "+"健康风险：中度增加");
        else if(bmi >= 30)System.out.println(" 身体状态：严重肥胖 "+"健康风险：严重增加");
        }
    }



package ifDemo;
import java.util.Scanner;


public class ifDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的成绩");
        double score = sc.nextDouble();
        if (score >= 60 && score < 80) {
            System.out.println("及格");
        }else if(score >= 80 && score < 100) {
            System.out.println("优秀");
        }else if (score == 100) {
            System.out.println("满分");
        }else if (score >100 || score < 0) {
            System.out.println("输入的成绩有误");
        }else {
            System.out.println("不及格");
        }

}
}

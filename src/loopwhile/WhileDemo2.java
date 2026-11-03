package loopwhile;
import java.util.Scanner;


public class WhileDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入计算方式（单利或复利）：");
        if(!scanner.hasNextLine()) {
            System.out.println("输入的计算方式有误");
            return;
        }
        String calculationMethod = scanner.nextLine();
        if (!calculationMethod.equals("单利") && !calculationMethod.equals("复利")) {
            System.out.println("输入的计算方式有误");
            return;
        }
        System.out.println("请输入投资金额：");
        if(!scanner.hasNextDouble()) {
            System.out.println("输入的金额有误");
            return;
        }
        double investment = scanner.nextDouble();
        System.out.println("请输入年利率：");
        if(!scanner.hasNextDouble()) {
            System.out.println("输入的年利率有误");
            return;
        }
        double annualInterestRate = scanner.nextDouble();
        double investment1 = investment*2;
        double investment3 = investment;
        int year = 0;
        if(calculationMethod.equals("单利")) {
            while(investment3 < investment1){
                investment3 += investment * (annualInterestRate / 100);
                year++;
            }
        }
        else{while(investment < investment1){
            investment += investment * (annualInterestRate / 100);
            year++;
        }}
        System.out.println("需要" + year + "年，投资金额才能翻倍");
    }
}

package ifDemo;
import java.util.Scanner;


public class ifdemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入订单价格");
        double price = sc.nextDouble();
        if (price <= 0) {
            System.out.println("输入的价格有误");
            return;
        }
        double price1 = price * 0.8;
        double price2 = (price > 30? price-10:price);
        double price3 = (price > 50? price-20:price);

        double min = price1;
        String stores = "1店";
        if (price2 < min) {
            min = price2;
            stores = "2店";
        } else if (price2 == min){
            stores += "2店";
        }
        if (price3 < min) {
            min = price3;
            stores = "3店";
        } else if (price3 == min){
            stores += "3店";
        }
        System.out.println("在" + stores + "下单更划算");
    }
}

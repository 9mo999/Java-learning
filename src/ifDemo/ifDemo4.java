package ifDemo;
import java.util.Scanner;


public class ifDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入订单价格");
        double price = sc.nextDouble();
        double price1 = price * 0.8;
        double price2 = (price > 30? price-10:price);
        double price3 = (price > 50? price-20:price);
        if (price <= 0) {System.out.println("输入的价格有误");
        } else {
            System.out.println("1店的价格是" + price1);
            System.out.println("2店的价格是" + price2);
            System.out.println("3店的价格是" + price3);

            if (price1 < price2 && price1 < price3) {
                System.out.println("在1店下单更划算");
            } else if (price2 < price1 && price2 < price3) {
                System.out.println("在2店下单更划算");
            } else if (price3 < price1 && price3 < price2) {
                System.out.println("在3店下单更划算");
            } else if (price1 == price2 && price1 < price3 && price2 < price3) {
                System.out.println("在1店2店下单都一样划算");
            } else if (price1 == price3 && price1 < price2 && price3 < price2) {
                System.out.println("在1店3店下单都一样划算");
            } else if (price2 == price3 && price2 < price1 && price3 < price1) {
                System.out.println("在2店3店下单都一样划算");
            } else if (price1 == price2 && price1 == price3) {
                System.out.println("在1店2店3店下单都一样划算");
            }}


        }}
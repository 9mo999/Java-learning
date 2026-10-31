package ifDemo;
import java.util.Scanner;


public class ifDemo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品价格：");
        if(!sc.hasNextDouble()) {
            System.out.println("输入的价格有误");
            return;
        }
        double price = sc.nextDouble();
        if (price <0) {
            System.out.println("输入的价格有误");
            return;
        }
        System.out.println("您是否有会员卡：（有/无）");
        String member = sc.next();

        if (!member.equals("有") && !member.equals("无")) {
            System.out.println("输入的会员卡状态有误");
            return;
        }
        double price1 = (price>=10)? price-8 : price;
        double price2 = (price>=50)? price-30 : price;
        double price3 = (price>=100)? price-50 : price;
        double price4 = (price>=200)? price-100 : price;
        double min = price1;
        String minPrice = "APP1";
        if(price2<min) {
            min = price2;
            minPrice = "APP2";
        }else if(price2==min){
            minPrice += ",APP2";
        }
        if(price3<min) {
            min = price3;
            minPrice = "APP3";
        }else if(price3==min){
            minPrice += ",APP3";
        }
        if(price4<min) {
            min = price4;
            minPrice = "APP4";
        }else if(price4==min){
            minPrice += ",APP4";
        }
        double price5 = 0;
        if (member.equals("有")){
            price5 = price*0.8;
            if(price5<min) {
                min = price5;
                minPrice = "会员卡";
            }else if(price5==min){
                minPrice += ",会员卡";
            }
        }System.out.println( minPrice + "下单更划算");
        System.out.println("APP1的价格是：" + price1);
        System.out.println("APP2的价格是：" + price2);
        System.out.println("APP3的价格是：" + price3);
        System.out.println("APP4的价格是：" + price4);
        System.out.println("会员卡的价格是：" + price5);
        sc.close();

    }


}

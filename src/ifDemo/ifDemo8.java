package ifDemo;
import java.util.Scanner;


public class ifDemo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品价格：");
        if(!sc.hasNextDouble()) {
            System.out.println("输入的价格有误");
            return;
        }
        double price = sc.nextDouble();
        System.out.println("您是否有会员卡：（有/无）");
        String member = sc.next();

        if (!member.equals("有") && !member.equals("无")) {
            System.out.println("输入的会员卡状态有误");
            return;
        } double discountPrice = 0;
        if (price >= 0){
            if (price < 10){
                discountPrice = price;
            } else if (price < 50){
                discountPrice = price - 8;
            } else if (price < 100){
                discountPrice = price - 30;
            } else if (price < 200){
                discountPrice = price - 50;
            } else {
                discountPrice = price - 100;
            }
        }else {
            System.out.println("输入的价格有误");
            return;
        }
        double memberPrice = 0;
        if (member.equals("有")) {
             memberPrice = price*0.8;
            if (memberPrice < discountPrice) {
                System.out.println("会员价更便宜，便宜了"+(discountPrice-memberPrice)+"元。" );
            } else if (memberPrice > discountPrice) {
                System.out.println("非会员价更便宜，便宜了"+(memberPrice-discountPrice)+"元。");
            } else {
                System.out.println("会员价和非会员价一样便宜。");

            }

        } else {
            System.out.println("优惠后的价格是"+discountPrice+"元。");
        }System.out.println("优惠劵的价格是"+discountPrice+"元。"+"会员价为"+memberPrice+"元。" );



}}

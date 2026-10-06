package ppp;

public class aaa {
    public static void main(String[] args) {
        //1.定义一个变量记录微信的余额
        double a = 100.0;


        //2.定义一个变量记录支付宝的余额
        double b = 200.0;


        //3.定义一个变量记录银行卡的余额
        double c = 300.0;


        //4.输出现在总共有多少钱
        System.out.println (a + b + c);


        //微信收了10元红包
        //原来的余额+10元余额=新的余额
        //让变量a记录新的余额
        a = a + 10;
        System.out.println (a);

        a = a - 2;
        System.out.println (a);
    }
}

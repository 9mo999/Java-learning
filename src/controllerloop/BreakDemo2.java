package controllerloop;


public class BreakDemo2 {
    public static void main (String[] args){
        for(int i = 0; i <= 100; i++){
            if(i % 7 == 0 || i % 10 == 7 || i / 10 == 7){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }



    }
}

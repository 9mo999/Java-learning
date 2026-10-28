package zzz;

public class VariableDemo5 {
    public static void main(String[] args) {
        double weight = 75.4;
        double height = 1.75;
        double bmi = weight / (height * height);
        System.out.println(bmi);
        double weight1 =75.4;
        double bmi1 = 23.9;
        double height1 = Math.sqrt(weight1 / bmi1);
        System.out.println(height1);
    }

}

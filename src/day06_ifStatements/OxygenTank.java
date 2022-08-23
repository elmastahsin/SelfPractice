package day06_ifStatements;

public class OxygenTank {
    public static void main(String[] args) {
        int level = 88;
        String result ="";
        if (level>=90){
            result = "Your tank is full";
        }
        if (level<90 && level >=80){
            result = "Still okay";
        }
        if (level<80 && level >=70){
            result = "Don't go too far";
        }
        if (level<70 && level >=60){
            result = "Start to head back";
        }  if (level<60 && level >=50){
            result = "Be careful  now you at %50";
        }
        System.out.println(result);


    }
}

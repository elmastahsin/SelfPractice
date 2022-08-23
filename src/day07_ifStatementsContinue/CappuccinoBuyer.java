package day07_ifStatementsContinue;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size = "asd";
        double price = 0;
        int calori = 0;

        if (size == "Tall"|| size=="Grande"|| size=="Venti") {
            if (size == "Tall") {
                price = 3.69;
                calori = 90;
            } else if (size == "Grande") {
                price = 3.99;
                calori = 120;
            } else {
                price = 4.29;
                calori = 150;
            }
            System.out.println("Cappuccino Size = " +size);
            System.out.println("price = $" + price);
            System.out.println("calori = " + calori);
        }else {
            System.out.println("Invalid Size");
        }

    }
}

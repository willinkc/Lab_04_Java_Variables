public class Lab_04_03_MonthlyCCBalance {
    public static void main(String[] args) {

        int ccBalance  =5000;
        double interestRate= 0.17;
        double totalCost1= ccBalance * interestRate;
        double totalCost2= ccBalance * interestRate + 850.00;

        System.out.println("The interest due after one month is "+totalCost1);
        System.out.println("The interest due after two months is "+totalCost2);
    }
}

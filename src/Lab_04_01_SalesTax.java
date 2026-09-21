public class Lab_04_01_SalesTax {
    public static void main(String[] args){
        double itemPrice=15.00;
        final double TAX_RATE=0.05;
        double salesTax = itemPrice * TAX_RATE;
        System.out.println("The sales tax for" + itemPrice+ " is " +salesTax);
    }
}

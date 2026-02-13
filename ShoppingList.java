public class ShoppingList {
    public static void main(String[] args) {
        
        double[] prices = {10.50, 5.25, 20.00, 1.99};
        int i;

        for(i = 0; i < prices.length; i++){
            System.out.println("$" + prices[i]);
        }
    }
}

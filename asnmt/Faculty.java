public class Faculty extends Person {
    public Faculty(String name, double balance) {
        super(name, balance);
    }
    public void purchase(FoodItem item, int quantity) 
        throws InsufficientBalanceException, InvalidQuantityException, InvalidFoodItemException {
        if (item == null) {
            throw new InvalidFoodItemException("Food item does not exist!");
        }
        if (quantity <= 0) {
            throw new InvalidQuantityException("Quantity must be greater than 0.");
        }
        double total = item.getPrice() * quantity;
        double discountedTotal = total * 0.9;
        if (balance < discountedTotal) {
            throw new InsufficientBalanceException("Insufficient balance for purchase.");
        }
        balance -= discountedTotal;
        System.out.println(name + " purchased " + quantity + " " + item.getName() + "(s) with discount for ₹" + discountedTotal);
    }
}

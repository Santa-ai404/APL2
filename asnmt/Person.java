public abstract class Person {
    protected String name;
    protected double balance;

    public Person(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public abstract void purchase(FoodItem item, int quantity) 
        throws InsufficientBalanceException, InvalidQuantityException, InvalidFoodItemException;
}

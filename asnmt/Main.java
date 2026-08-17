public class Main {
    public static void main(String[] args) {
        FoodItem pizza = new FoodItem("Pizza", 100);
        FoodItem sandwich = new FoodItem("Sandwich", 60);
        FoodItem coffee = new FoodItem("Coffee", 40);
        Person student = new Student("Alice", 150);
        Person faculty = new Faculty("Dr. Bob", 500);
        try {
            student.purchase(sandwich, 2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            student.purchase(pizza, 2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            faculty.purchase(pizza, 2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            student.purchase(coffee, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            faculty.purchase(null, 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

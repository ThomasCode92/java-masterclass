public class Main {

    public static void main(String[] args) {

        MealOrder mealOrder = new MealOrder();
        mealOrder.addBurgerToppings("BACON", "CHEESE", "MAYO");
        mealOrder.setDrinkSize(Size.LARGE);
        mealOrder.printItemizedList();

        System.out.println("-".repeat(35));
        
        MealOrder secondMeal = new MealOrder("turkey", "7-up", "chili");
        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
        secondMeal.setDrinkSize(Size.SMALL);
        secondMeal.printItemizedList();
    }
}

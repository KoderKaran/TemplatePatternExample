public class Starbucks {
	public static void main(String[] args){
		Tea tea = new Tea();
		Coffee coffee = new Coffee();

		System.out.println("Tea making process:");
		tea.prepareRecipe();

		System.out.println("\nCoffee making process:");
		coffee.prepareRecipe();
	}
}

public class Main {
    public static void main(String[] args) {
        // Создаем несколько горячих напитков
        HotBeverageWithTemperature coffee = new HotBeverageWithTemperature("Coffee", 250, 80);
        HotBeverageWithTemperature tea = new HotBeverageWithTemperature("Tea", 200, 75);
        HotBeverageWithTemperature hotChocolate = new HotBeverageWithTemperature("Hot Chocolate", 300, 85);

        // Создаем автомат для горячих напитков и добавляем в него напитки
        HotBeverageVendingMachine vendingMachine = new HotBeverageVendingMachine();
        vendingMachine.addBeverage(coffee);
        vendingMachine.addBeverage(tea);
        vendingMachine.addBeverage(hotChocolate);

        // Запрашиваем продукт из автомата
        HotBeverageWithTemperature requestedBeverage = vendingMachine.getProduct("Tea", 200, 75);

        // Проверяем результат запроса
        if (requestedBeverage != null) {
            System.out.println("You have received: " + requestedBeverage);
        } else {
            System.out.println("Beverage not found.");
        }
    }
}

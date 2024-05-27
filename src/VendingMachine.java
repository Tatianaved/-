public interface VendingMachine {
    HotBeverageWithTemperature getProduct(String name, int volume, int temperature);
}

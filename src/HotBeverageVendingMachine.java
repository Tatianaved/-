import java.util.ArrayList;
import java.util.List;

public class HotBeverageVendingMachine implements VendingMachine {
    private List<HotBeverageWithTemperature> beverages;

    public HotBeverageVendingMachine() {
        this.beverages = new ArrayList<>();
    }

    public void addBeverage(HotBeverageWithTemperature beverage) {
        beverages.add(beverage);
    }

    @Override
    public HotBeverageWithTemperature getProduct(String name, int volume, int temperature) {
        for (HotBeverageWithTemperature beverage : beverages) {
            if (beverage.getName().equals(name) && beverage.getVolume() == volume && beverage.getTemperature() == temperature) {
                return beverage;
            }
        }
        return null;
    }
}

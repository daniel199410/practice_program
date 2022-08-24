package additions;

import beverages.Beverage;

public class Milk implements Beverage {
    @Override
    public double price() {
        return 0.10;
    }
}

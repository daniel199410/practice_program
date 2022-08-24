package beverages;

import java.util.List;

public class BeverageWithAdditions implements Beverage {
    private final Beverage beverage;
    private final List<Beverage> additions;

    public BeverageWithAdditions(Beverage beverage, List<Beverage> additions) {
        this.beverage = beverage;
        this.additions = additions;
    }

    @Override
    public double price() {
        return beverage.price() + additions.stream().map(Beverage::price).reduce(0.0, Double::sum);
    }
}

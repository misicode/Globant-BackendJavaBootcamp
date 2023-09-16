package _02JUnit.P101;

public class DiscountCalculator {
    /**
     * This method calculates the discount to be applied to the price of a product.
     * The maximum value of the discount is 40% and the minimum value is 1%,
     * otherwise no discount will apply.
     * @param price     product cost
     * @param discount  discount percentage to apply
     * @return          value of the amount to be discounted
     */
    public double calculateDiscount(double price, int discount) {
        return (discount > 40 || discount < 1) ? 0 : price * discount / 100;
    }
}

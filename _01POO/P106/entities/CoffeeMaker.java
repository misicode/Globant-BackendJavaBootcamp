package _01POO.P106.entities;

public class CoffeeMaker {
    private float maxCapacity;
    private float currentAmount;

    public CoffeeMaker() {}

    public CoffeeMaker(float maxCapacity, float currentAmount) {
        this.maxCapacity = maxCapacity;
        this.currentAmount = currentAmount;
    }

    public float getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(float maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public float getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(float currentAmount) {
        this.currentAmount = currentAmount;
    }
}

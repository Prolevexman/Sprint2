package model;

import model.constants.Discount;

public abstract class Food implements Discountable{
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    public Food(int amount, double price) {
        this.amount = amount;
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return Discount.DISCOUNT_DEFAULT;
    }

    public boolean getIsVegetarian() {
        return isVegetarian;
    }

    public double calculateTotalPrice(boolean isApplyDiscount) {
        if (isApplyDiscount) {
            return price * amount * ((100-getDiscount()) / 100);
        } else {
            return price * amount;
        }
    }

}

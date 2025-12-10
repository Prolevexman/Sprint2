package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price);
        this.colour = colour;
        isVegetarian = true;
    }

    @Override
    public double getDiscount() {
        if (Colour.COLOUR_RED.equals(colour)) {
            return Discount.DISCOUNT_RED_APPLE;
        } else {
            return Discount.DISCOUNT_DEFAULT;
        }
    }

}

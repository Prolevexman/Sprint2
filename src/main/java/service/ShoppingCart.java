package service;

import model.Food;

public class ShoppingCart {
    private Food[] goods;

    public ShoppingCart(Food[] goods) {
        this.goods = goods;
    }

    public double calculateTotalPrice(boolean isApplyDiscount) {
        double totalPrice = 0;
        if (goods != null) {
            for (int i = 0; i < goods.length; i++) {
                if (goods[i] != null) {
                    totalPrice = totalPrice + (goods[i].calculateTotalPrice(isApplyDiscount) );
                }
            }
        }
        return totalPrice;
    }

    public double calculateTotalPriceVegetarian(boolean isApplyDiscount) {
        double totalPrice = 0;
        if (goods != null) {
            for (int i = 0; i < goods.length; i++) {
                if (goods[i] != null && goods[i].getIsVegetarian()) {
                    totalPrice = totalPrice + (goods[i].calculateTotalPrice(isApplyDiscount));
                }
            }
        }
        return totalPrice;
    }
}

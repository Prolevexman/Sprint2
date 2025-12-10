package prolevexman;

import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple appleRed = new Apple(10, 50, Colour.COLOUR_RED);
        Apple appleGreen = new Apple(8, 60, Colour.COLOUR_GREEN);

        Food[] goods = {meat, appleGreen, appleRed};

        ShoppingCart shoppingCart = new ShoppingCart(goods);

        System.out.println("Общая сумма товаров без скидки: " + shoppingCart.calculateTotalPrice(false));
        System.out.println("Общая сумма товаров со скидкой: " + shoppingCart.calculateTotalPrice(true));
        System.out.println("Общая сумма вегетарианских товаров без скидки: " + shoppingCart.calculateTotalPriceVegetarian(false));
    }
}

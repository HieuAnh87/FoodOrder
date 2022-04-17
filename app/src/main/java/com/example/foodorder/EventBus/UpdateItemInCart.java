package com.example.foodorder.EventBus;

import com.example.foodorder.Database.CartItem;

public class UpdateItemInCart {
    private CartItem cartItem;

    public UpdateItemInCart(CartItem cartItem)
    {
        this.cartItem = cartItem;
    }

    public CartItem getCartItem() {
        return cartItem;
    }

    public void setCartItem(CartItem cartItem) {
        this.cartItem = cartItem;
    }
}

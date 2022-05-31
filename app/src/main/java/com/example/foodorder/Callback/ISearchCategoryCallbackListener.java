package com.example.foodorder.Callback;


import com.example.foodorder.Database.CartItem;
import com.example.foodorder.Model.CategoryModel;

public interface ISearchCategoryCallbackListener {
    void onSearchCategoryFound(CategoryModel categoryModel, CartItem cartItem);
    void onSearchCategoryNotFound(String message);
}

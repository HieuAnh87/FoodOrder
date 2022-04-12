package com.example.foodorder.Callback;

import com.example.foodorder.Model.CategoryModel;

import java.util.List;

public interface ICategoryCallbackListener {
    void onCategoryLoadSuccess(List<CategoryModel> CategoryModelList);
    void onCategoryLoadFailed(String message);
}

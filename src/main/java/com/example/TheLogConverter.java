package com.example;

import com.example.entity.Category;
import com.example.entity.CategoryLog;

public class TheLogConverter {

    public static CategoryLog categoryLogConverter(Category category){
        CategoryLog categoryLog=new CategoryLog();
        categoryLog.setCategoryId(category.getCategoryId());
        categoryLog.setCategoryName(category.getCategoryName());
        categoryLog.setCreatedDateTime(category.getCreatedDateTime());
        categoryLog.setCreatedUser(category.getCreatedUser());
        categoryLog.setLastModifiedDateTime(category.getLastModifiedDateTime());
        categoryLog.setLastModifiedUser(category.getLastModifiedUser());
        categoryLog.setVersion(category.getVersion());
        return categoryLog;
    }
}

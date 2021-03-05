package com.housekeeping.dao;

import com.housekeeping.bean.Category;
import com.housekeeping.bean.extend.CategoryExtend;

import java.util.List;

public interface CategoryMapper {

    List<Category> selectAll();

    void insert(Category category);

    List<CategoryExtend> selectCategoryTree();

    List<Category> selectByParentId();
}

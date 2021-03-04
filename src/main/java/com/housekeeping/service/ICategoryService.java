package com.housekeeping.service;

import com.housekeeping.bean.Category;
import com.housekeeping.bean.extend.CategoryExtend;

import java.util.List;

public interface ICategoryService {

    /**
     * description: 查询所有
     * @param
     * @return java.util.List<com.housekeeping.bean.Category>
    */
    List<Category> findAll();

    /**
     * description: 保存
     * @param category
     * @return void
    */
    void save(Category category);

    /*
     * description: 查询栏目树
     * @param
     * @return java.util.List<com.housekeeping.bean.extend.CategoryExtend>
    */
    List<CategoryExtend> findCategoryTree();
}

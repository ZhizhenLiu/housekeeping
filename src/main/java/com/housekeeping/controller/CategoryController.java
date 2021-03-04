package com.housekeeping.controller;

import com.housekeeping.bean.Category;
import com.housekeeping.bean.extend.CategoryExtend;
import com.housekeeping.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * description: 栏目管理控制器类
 * date: 2021/3/3 16:52
 * author: zhizhenLiu
 * version: 1.0
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("findAll")
    public List<Category> findAll()
    {
        return categoryService.findAll();
    }

    @PostMapping("save")
    public String save(Category category)
    {
        categoryService.save(category);
        return "保存成功";
    }

    @GetMapping("findCategoryTree")
    public List<CategoryExtend> findCategoryTree()
    {
        return categoryService.findCategoryTree();
    }
}

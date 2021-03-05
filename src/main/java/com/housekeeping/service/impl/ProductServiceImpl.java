package com.housekeeping.service.impl;
/**
 * description: 分类管理的业务实现类
 * date: 2021/3/3 16:52
 * author: zhizhenLiu
 * version: 1.0
 */

import com.housekeeping.bean.Category;
import com.housekeeping.bean.extend.CategoryExtend;
import com.housekeeping.dao.CategoryMapper;
import com.housekeeping.service.ICategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CategoryServiceImpl implements ICategoryService {
    @Resource
    private CategoryMapper categoryMapper;
    /**
     * description: 查询所有
     * @return java.util.List<com.housekeeping.bean.Category>
     */
    @Override
    public List<Category> findAll() {
        return categoryMapper.selectAll();
    }

    /**
     * description: 保存
     * @param category
     * @return void
     */
    @Override
    public void save(Category category) {
        categoryMapper.insert(category);
    }

    @Override
    public List<CategoryExtend> findCategoryTree() {
        return categoryMapper.selectCategoryTree();
    }
}

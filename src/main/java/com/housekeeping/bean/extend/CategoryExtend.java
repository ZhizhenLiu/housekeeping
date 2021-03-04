package com.housekeeping.bean.extend;

import com.housekeeping.bean.Category;

import java.util.List;

/**
 * description: CategoryExtend
 * date: 2021/3/4 10:57
 * author: zhizhenLiu
 * version: 1.0
 */
public class CategoryExtend extends Category {
    private List<Category> children;

    public List<Category> getChildren() {
        return children;
    }

    public void setChildren(List<Category> children) {
        this.children = children;
    }
}

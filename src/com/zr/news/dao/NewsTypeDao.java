package com.zr.news.dao;

import com.zr.news.entity.NewsType;

import java.util.List;

/**
 * @author: Iman
 * date   : 2019/3/11
 */
public interface NewsTypeDao {
    public List<NewsType>findAll();
}

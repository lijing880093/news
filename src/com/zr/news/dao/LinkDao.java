package com.zr.news.dao;

import com.zr.news.entity.Link;

import java.util.List;

/**
 * @author: Iman
 * date   : 2019/3/11
 */
public interface LinkDao {

        public List<Link> findAll();

}

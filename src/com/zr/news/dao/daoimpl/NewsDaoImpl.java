package com.zr.news.dao.daoimpl;

import com.zr.news.dao.NewsDao;
import com.zr.news.entity.News;
import com.zr.news.framework.JdbcUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Iman
 * date   : 2019/3/11
 */
public class NewsDaoImpl  implements NewsDao {


    @Override
    public List<News> findAll() {

        return null;

    }

    public List<News> getNews(String sql) {
        List<News> list=new ArrayList<>();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            Connection connection = JdbcUtils.getConnection();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){

                int newsId = rs.getInt("news_id");
                String title = rs.getString("title");
                String context = rs.getString("context");
                String author = rs.getString("author");
                int typeId = rs.getInt("type_id");
                Date publish_date = rs.getDate("publish_date");
                int isImage = rs.getInt("is_image");
                String image_url = rs.getString("image_url");
                int click = rs.getInt("click");
                int isHot = rs.getInt("is_hot");
                News news=new News(newsId,title,context,author,typeId,publish_date,isImage,image_url,click,isHot);

                list.add(news);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(rs!=null)
                    rs.close();
                if(ps!=null)
                    ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            JdbcUtils.close();
        }

        return list;
    }

    @Override
    public List<News> findImageNews() {
        String sql="select * from news where is_image=1 order by publish_date desc limit 0,4";
        return getNews(sql);
    }

    @Override
    public News findHeadNews() {
        String sql="select * from news  order by publish_date desc ";
        return getNews(sql).get(0);
    }

    @Override
    public List<News> findNewNews() {
        String sql="select * from news order by publish_date desc limit 0,8";
        return getNews(sql);
    }

    @Override
    public List<News> findHotNews() {
        String sql="select * from news where is_hot=1 order by publish_date desc limit 0,8";
        return getNews(sql);
    }

    @Override
    public List<News> findNewsByType(int typeId) {
        String sql="select * from news where type_id="+typeId+" order by publish_date desc limit 0,8";
        return getNews(sql);
    }

}

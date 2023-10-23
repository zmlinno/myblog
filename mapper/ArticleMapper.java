package com.example.demo.mapper;

import com.example.demo.entity.Articleinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface ArticleMapper {

    int getArtCountByUid(@Param("uid") Integer uid);

    List<Articleinfo> getMyList(@Param("uid") Integer uid);
    //写完这个在去xml


    //这是从删除前端过来的写后端的第一步

    int del(@Param("id") Integer id,@Param("uid") Integer uid);
    //写完这一步然后转到xml,
    //写完xml在去写Service
    Articleinfo getDetail(@Param("id") Integer id);

    /////////
    int incrRCount(@Param("id") Integer id);

    int add(Articleinfo articleinfo);

    int update(Articleinfo articleinfo);

    List<Articleinfo> getListByPage(@Param("psize") Integer psize,
                                    @Param("offsize") Integer offsize);

    int getCount();



}
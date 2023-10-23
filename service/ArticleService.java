package com.example.demo.service;

import com.example.demo.entity.Articleinfo;
import com.example.demo.mapper.ArticleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;




@Service
public class ArticleService {
    @Resource
    private ArticleMapper articleMapper;
    public int getArtCountByUid(Integer uid){
        return articleMapper.getArtCountByUid(uid);


    }
    public List<Articleinfo>getMyList(Integer uid){
        return articleMapper.getMyList(uid);
        //这样的话service也完成了
    }

    public int del(Integer id,Integer uid){
        return articleMapper.del(id,uid);
        //删除，在去AController写。这是第四步了
    }
    public Articleinfo getDetail(Integer id){
        return articleMapper.getDetail(id);
    }


    //到最后一句都是自己加的今天
    public int incrRCount(Integer id)
    {
        return articleMapper.incrRCount(id);
    }

    public int add(Articleinfo articleinfo)
    {
        return articleMapper.add(articleinfo);
    }

    public int update(Articleinfo articleinfo)
    {
        return articleMapper.update(articleinfo);
    }

    public List<Articleinfo> getListByPage(Integer psize, Integer offsize) {
        return articleMapper.getListByPage(psize, offsize);
    }

    public int getCount()
    {
        return articleMapper.getCount();
    }


}

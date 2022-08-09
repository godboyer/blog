package com.example.blog.service;

import com.example.blog.po.Blog;
import com.example.blog.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface BlogService {

    Blog getBlog(Long id);

    Page<Blog>  listBlog(Pageable pageable, BlogQuery blog);

    Page<Blog> listBlog(String query, Pageable pageable);

    Page<Blog>  ListBlog(Pageable pageable);

    Page<Blog>  listBlog(Long tagId ,Pageable pageable);

    List<Blog>  listRecommendBlogTop(Integer size);

    Blog saveBlog(Blog blog);

    Blog updateBlog(Long id, Blog blog);
    /*归档引用参数*/
    Map<String,List<Blog>> archiveBlog();

    void deleteBlog(Long id);

    Blog getAndConvert(Long id);

    Long countBlog();
}

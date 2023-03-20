package com.itheima.service;

import com.itheima.domain.Book;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * =========================服务层===============================================
 */
@Transactional
public interface BookService {


    /**
     * 保存
     * @param book
     * @return
     */
    public boolean save(Book book);


    /**
     * 修改
     * @param book
     * @return
     */
    public boolean update(Book book);


    /**
     * 删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);


    /**
     * 查询一条
     * @param id
     * @return
     */
    public  Book getById(Integer id);


    /**
     * 查询所有
     * @return
     */
    public List<Book> getAll();
}
/**
 * =========================服务层===============================================
 */


//@Transactional
//public interface BookService {
//
//
//    /**
//     * 保存
//     * @param book
//     * @return
//     */
//    public boolean save(Book book);
//
//
//    /**
//     * 修改
//     * @param book
//     * @return
//     */
//    public boolean update(Book book);
//
//
//    /**
//     * 删除
//     * @param id
//     * @return
//     */
//    public boolean delete(Integer id);
//
//
//    /**
//     * 查询一条
//     * @param id
//     * @return
//     */
//    public  Book getById(Integer id);
//
//
//    /**
//     * 查询所有
//     * @return
//     */
//    public List<Book> getAll();
//}
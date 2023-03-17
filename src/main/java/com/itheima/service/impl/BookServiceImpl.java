package com.itheima.service.impl;

import com.itheima.controller.Code;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.exception.BusinessException;
import com.itheima.exception.SystemException;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }

    @Override
    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }

    /**
     ==============================业务层中处理异常的的两种方式===========================
     */
    @Override
    public Book getById(Integer id) {


        /**
         ==============================第一种===========================
         */
        if(id == 1){
            throw new BusinessException(Code.BUSINESS_ERR,"输入错误");
        }
        /**
         ==============================第二种===========================
         */

        try {
            int i= 1/0;
        }catch (Exception e){
            throw new SystemException(Code.SYSTEM_ERR,"系统异常，请重试");

        }

        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}

package com.itheima.controller;

import com.itheima.exception.BusinessException;
import com.itheima.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
/**
 ==============================拦截异常并处理===========================
 */

//需要被SpringMvc的@ComponentScan扫描到
@RestControllerAdvice
public class ProjectExceptionAdvice {


//系统异常处理
    @ExceptionHandler({SystemException.class})
    public Result doSystemException(SystemException ex){
        //记录日志
        //发送消息给运维人员
        //发送邮件给开发人员，异常对象ex发给开发人员
        return new Result(ex.getCode(),null,ex.getMessage());
    }


    //业务异常处理
    @ExceptionHandler({BusinessException.class})
    public Result doBusinessException(BusinessException ex){

        return new Result(ex.getCode(),null,ex.getMessage());
    }




    //其他异常处理
    @ExceptionHandler({Exception.class})
    public Result doException(Exception ex){
        //记录日志
        //发送消息给运维人员
        //发送邮件给开发人员，异常对象ex发给开发人员

        return new Result(Code.SYSTEM_UNKNOWN_ERR,null,"系统繁忙请稍后再试");
    }
}

package com.itheima.exception;
/**
 * =========================表现层===============================================
 */
public class BusinessException extends RuntimeException{
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public BusinessException(Integer code , String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}
/**
 * =========================表现层===============================================
 */
//public class BusinessException extends RuntimeException{
//    private Integer code;
//
//    public Integer getCode() {
//        return code;
//    }
//
//    public void setCode(Integer code) {
//        this.code = code;
//    }
//
//    public BusinessException(Integer code , String message) {
//        super(message);
//        this.code = code;
//    }
//
//    public BusinessException(Integer code, String message, Throwable cause) {
//        super(message, cause);
//        this.code = code;
//    }
//}
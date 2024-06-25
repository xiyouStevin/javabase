package com.dwh.common.Throwable;

/**
 * @author: Steven
 * @create: 2024-06-25 10:38
 * @Description: 自定义异常
 * 集成现有的异常结构：RuntimeException(不用处理)，Exception(需要处理)
 */
public class MyExceptionBaseMethod extends RuntimeException{
    static final long serialVersionUID = -1234719074324978L;

    public MyExceptionBaseMethod(){

    }

    public MyExceptionBaseMethod(String message){
        super(message);
    }

    public static  void main(String[] args) {
        throw new MyExceptionBaseMethod("自定义异常");
    }
}

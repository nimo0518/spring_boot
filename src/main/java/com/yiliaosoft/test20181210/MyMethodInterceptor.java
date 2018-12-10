package com.yiliaosoft.test20181210;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyMethodInterceptor implements MethodInterceptor{

    private Object target;
    public MyMethodInterceptor(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        //前置增强
        doSomeThingBefore();
        //返回值
        Object res = null;
        //调用父类的方法
        //Object res = methodProxy.invokeSuper(proxy,args);
        if(target != null){
            res = method.invoke(target,args);
        }
        doSomeThingAfter();
        return res;



    }

    private void doSomeThingAfter(){
        System.out.println("do after...............");
    }
    private void doSomeThingBefore(){
        System.out.println("do before...............");
    }
}

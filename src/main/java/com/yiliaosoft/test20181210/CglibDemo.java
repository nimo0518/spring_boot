package com.yiliaosoft.test20181210;

import org.springframework.cglib.proxy.CallbackFilter;
import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.Method;

public class CglibDemo {
    public static void main(String[] args) {
        Enhancer en = new Enhancer();
        TeacherCang tc = new TeacherCang();
        //设置增强回调
        en.setCallback(new MyMethodInterceptor(tc));
        //1、获得接口代理对象
        en.setInterfaces(new Class[]{Girl.class});
        Girl g = (Girl) en.create();
        g.dating(1.6f);
        System.out.println("------------------------------");

        //对类生成代理对象
        en.setSuperclass(TeacherCang.class);
        en.setInterfaces(null);
        //当有多个Callback 需要CallbackFilter来指定被代理的方法使用第几个callback
        /*en.setCallbackFilter(new CallbackFilter() {
            @Override
            public int accept(Method method) {
                return 0;
            }
        });*/

        TeacherCang proxy = (TeacherCang) en.create();
        proxy.dating(1.9f);

    }
}

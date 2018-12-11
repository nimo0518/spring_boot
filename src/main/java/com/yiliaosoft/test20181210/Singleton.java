package com.yiliaosoft.test20181210;

public class Singleton {
    private static volatile  Singleton singleton;

    public String string;
    private Singleton(){}

    public String getString(){
        return string;
    }

    public void setString(String string){
        this.string = string;
    }

    public static Singleton getSingleton(){
        //双重检查，保证单例 注意volatile关键字
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                    singleton.setString("aa");
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        System.out.println(Singleton.getSingleton().getString());

    }
}

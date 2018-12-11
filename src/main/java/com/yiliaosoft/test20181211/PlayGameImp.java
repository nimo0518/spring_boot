package com.yiliaosoft.test20181211;

public class PlayGameImp extends PlayGame {
    @Override
    protected void initalize() {
        System.out.println("初始化");
    }

    @Override
    protected void startPlay() {
        System.out.println("开始了");
    }

    @Override
    protected void endPlay() {
        System.out.println("结束了");
    }

    public static void main(String[] args) {
        PlayGame pl = new PlayGameImp();
        pl.play();
    }
}

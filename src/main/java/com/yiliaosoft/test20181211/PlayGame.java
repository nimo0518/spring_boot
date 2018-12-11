package com.yiliaosoft.test20181211;

public abstract class PlayGame {

    protected  abstract void initalize();

    protected  abstract  void startPlay();

    protected  abstract  void endPlay();

    public final  void play(){

        initalize();
        startPlay();
        endPlay();
    }
}

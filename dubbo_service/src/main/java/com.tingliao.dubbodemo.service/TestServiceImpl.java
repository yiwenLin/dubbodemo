package com.tingliao.dubbodemo.service;

/**
 * Created by Administrator on 2017/7/19.
 */
public  class TestServiceImpl implements TestService{
    public void test(){
      System .out.println("---TestServiceImpl test 服务被调用-------------------------");
    };



    public String testService(String str){
        System .out.println("---TestServiceImpl testService("+str+") 服务被调用-------------------------");
        return "还给你："+str;
    }

}

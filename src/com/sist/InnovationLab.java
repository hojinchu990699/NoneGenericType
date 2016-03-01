package com.sist;

/**
 * Created by hojin on 16. 3. 1.
 */
public class InnovationLab {
    public static void main(String[] args){
        Innovation innovation=new Innovation();
        innovation.set("애플");   //String 타입을 Object타입으로 자동 타입 변환해서 저장.
        String name=(String)innovation.get();
                                //Object 타입을 String타입으로 강제 타입 변환해서 얻음.
        System.out.println(name);

        innovation.set(new Apple());  //Apple 타입을 Object타입으로 자동 타입 변환해서 저장.
        Apple apple=(Apple)innovation.get();
                                      //Object 타입을 Apple타입으로 강제 타입 변환해서 얻음.
    }
}

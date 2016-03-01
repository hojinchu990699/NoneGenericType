package com.sist;

/**
 * Created by hojin on 16. 3. 1.
 */
public class Innovation {
    private Object object;  //다양한 객체 타입을 저장 할수 있다.
    public void set(Object object){
        this.object=object;
    }
    public Object get(){
        return object;
    }
}

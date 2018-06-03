package com.learn.groovyinaction.chap7

class PretendFieldCounter {

    public count = 0

    Object get(String name){
        'pretend value'
    }

    void set(String name, Object value){
        count ++
    }
}

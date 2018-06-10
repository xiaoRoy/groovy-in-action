package com.learn.groovyinaction.chap7.objectoriented

trait Entity implements HasId, HasVersion, Persistent{
    boolean save(){
        version ++
        Persistent.super.save()
    }
}

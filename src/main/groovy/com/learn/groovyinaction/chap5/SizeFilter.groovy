package com.learn.groovyinaction.chap5

class SizeFilter {
    Integer limit

    boolean sizeUpTo(String value){
        return value.size() <= limit
    }
}

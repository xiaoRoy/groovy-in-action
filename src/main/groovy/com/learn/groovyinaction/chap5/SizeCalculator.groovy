package com.learn.groovyinaction.chap5

class SizeCalculator {

    int calculateSize(List<?> list){
        return list.size()
    }

    int calculateSize(String text){
        return text.size()
    }
}

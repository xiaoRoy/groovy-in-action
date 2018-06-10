package com.learn.groovyinaction.chap7.groovybean

class DoublerBean {

    public def value

    def getValue () {
        return value * 2
    }

    void setValue (value) {
        this.value = value
    }
}

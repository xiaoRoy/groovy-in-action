package com.learn.groovyinaction.chap7.objectoriented

trait Persistent {
    boolean save() {
        println "saving ${this.dump()}"
        true
    }
}

package com.learn.groovyinaction.chap7.groovybean

class Student {
    String firstName, lastName

    String getName(){
        "$firstName $lastName"
    }
}

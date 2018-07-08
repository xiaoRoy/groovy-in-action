package com.learn.groovyinaction.chap19

class Robot {
    void move (Direction direction) {
        println "robot moved $direction"
    }

    void move(Direction direction, Distance distance){
        println "robot moved $direction by $distance"
    }
}

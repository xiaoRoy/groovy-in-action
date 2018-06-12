package com.learn.groovyinaction.chap19.origin

enum Direction {
    left, right, forward, backward
}

class Robot {
    void move (Direction dir) {
    }
}

def robot = new Robot()
robot.move left

package com.learn.groovyinaction.chap19.scriptclass

abstract class RobotBaseScript extends Script{
    void move(dir){
        this.binding.robot.move dir
    }
}

package com.learn.groovyinaction.chap19.closure

import com.learn.groovyinaction.chap19.Direction

class RobotBinding extends Binding {

    private Map variables

    RobotBinding (Map variables) {
        this.variables = [
                *: variables,
                *: Direction.values().collectEntries { [(it.name()): it] }
        ]
    }

    def getVariable(String name){
        this.variables[name.toLowerCase()]
    }
}

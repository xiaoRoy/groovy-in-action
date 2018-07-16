package com.learn.groovyinaction.chap19.scriptclass

import com.learn.groovyinaction.chap19.Direction
import com.learn.groovyinaction.chap19.Robot

def binding = new Binding(robot: new Robot(), *: Direction.values().collectEntries {
    [(it.name()): it]
})
def shell = new GroovyShell(this.class.classLoader, binding)
def script = """
    @BaseScript(RobotBaseScript)
    import groovy.transform.BaseScript
    
    move left
"""
shell.evaluate(script)

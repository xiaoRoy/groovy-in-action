package com.learn.groovyinaction.chap19.closure

import com.learn.groovyinaction.chap19.Direction
import com.learn.groovyinaction.chap19.Robot

def robot = new Robot()
def binding = new Binding(
        robot: robot,
        move: robot.&move,
        *: Direction.values().collectEntries { [(it.name()): it] }
)
def shell = new GroovyShell(this.class.classLoader, binding)
def script = """
    move left
"""
shell.evaluate(script)

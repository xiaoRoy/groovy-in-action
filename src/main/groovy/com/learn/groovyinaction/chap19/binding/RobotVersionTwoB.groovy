package com.learn.groovyinaction.chap19.binding

import com.learn.groovyinaction.chap19.Direction
import com.learn.groovyinaction.chap19.Robot

def binding = new Binding(
        robot: new Robot(),
        left: Direction.left,
        right: Direction.right,
        forward: Direction.forward,
        backwardk: Direction.backward)

def bindingWithCollectEntries = new Binding(
        robot: new Robot(),
        *: Direction.values().collectEntries { [(it.name()): it] }
)

def shell = new GroovyShell(this.class.classLoader, binding)
def script = """
    robot.move left
"""
shell.evaluate(script)

package com.learn.groovyinaction.chap19.binding

import com.learn.groovyinaction.chap19.origin.Robot


def binding = new Binding(robot: new Robot())
def shell = new GroovyShell(this.class.classLoader, binding)
def script =  '''
    import static v02.model.Direction.*
    robot.move left
'''
shell.evaluate script

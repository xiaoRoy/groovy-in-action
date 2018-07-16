package com.learn.groovyinaction.chap19.namedargument

import com.learn.groovyinaction.chap19.Direction
import com.learn.groovyinaction.chap19.Duration
import com.learn.groovyinaction.chap19.Robot

def robot = new Robot()
def binding = new Binding([
        'robot': robot,
        'h'    : Duration.hour,
        move   : robot.&move,
        *      : Direction.values().collectEntries { [(it.name()): it] }
])

def shell = new GroovyShell(this.class.classLoader, binding)
def script = """
    move right, by: 3.m, at: 5.km/h
"""
use(DistanceAbbreviationCategory) {
    shell.evaluate script
}

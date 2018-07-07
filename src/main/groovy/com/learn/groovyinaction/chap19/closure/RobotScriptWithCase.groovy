package com.learn.groovyinaction.chap19.closure

import com.learn.groovyinaction.chap19.Robot
import com.learn.groovyinaction.chap19.scriptclass.CaseRobotBaseScript
import org.codehaus.groovy.control.CompilerConfiguration

def binding = new RobotBinding(robot: new Robot())

def config = new CompilerConfiguration()
config.scriptBaseClass = CaseRobotBaseScript.name

def shell = new GroovyShell(this.class.classLoader, binding, config)
def script = """
    mOVe lEfT
"""
shell.evaluate(script)


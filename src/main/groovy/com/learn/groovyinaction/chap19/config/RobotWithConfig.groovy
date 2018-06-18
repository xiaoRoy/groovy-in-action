package com.learn.groovyinaction.chap19.config

import com.learn.groovyinaction.chap19.Direction
import com.learn.groovyinaction.chap19.Robot
import com.learn.groovyinaction.chap19.scriptclass.RobotBaseScript
import org.codehaus.groovy.control.CompilerConfiguration
import org.codehaus.groovy.control.customizers.ImportCustomizer

def binding = new Binding(robot: new Robot())

def importCustomizer = new ImportCustomizer()
importCustomizer.addStaticStars Direction.name

def config = new CompilerConfiguration()
config.addCompilationCustomizers importCustomizer
config.scriptBaseClass = RobotBaseScript.name

def shell = new GroovyShell(this.class.classLoader, binding, config)
def script = """
    move left
"""
shell.evaluate(script)

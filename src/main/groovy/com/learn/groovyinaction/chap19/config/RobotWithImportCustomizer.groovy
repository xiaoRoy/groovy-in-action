package com.learn.groovyinaction.chap19.config

import com.learn.groovyinaction.chap19.Robot
import org.codehaus.groovy.control.CompilerConfiguration
import org.codehaus.groovy.control.customizers.ImportCustomizer

def binding = new Binding(robot: new Robot())

def importCustomizer = new ImportCustomizer()
importCustomizer.addStaticStars 'com.learn.groovyinaction.chap19.Direction'

def config = new CompilerConfiguration()
config.addCompilationCustomizers importCustomizer

def shell = new GroovyShell(this.class.classLoader, binding, config)
def script =  """
    robot.move left
"""
shell.evaluate(script)

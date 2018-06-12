package com.learn.groovyinaction.chap19.binding

def binding = new Binding([distance: 11400, time: 5 * 60])
def shell = new GroovyShell(binding)
def script = """
    speed = distance / time
"""
shell.evaluate(script)
assert binding.distance == 11400
assert binding.time == 300
assert binding.speed == 38

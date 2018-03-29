package com.learn.groovyinaction.chap2

def groovyInAction = new ImmutableBook("Groovy In Action")
def anotherGroovyInAction = new ImmutableBook("Groovy In Action")

assert groovyInAction.title == "Groovy In Action"
assert groovyInAction == anotherGroovyInAction

try {
    groovyInAction.title = "Groovy In Action 2nd"
    assert false, 'should not reach here'
}catch (ReadOnlyPropertyException exception){
    println "Exception Message: $exception.message"
}

package com.learn.tutorial.closure

def listener = { name -> println "Hello, $name" }
assert listener instanceof Closure

Closure callback = { println "Done!" }
assert callback instanceof Closure

Closure<Boolean> textFilter = { String text -> text.size() > 0 }
assert textFilter("love")

def code = { 123 }
assert code() == 123
Closure<Integer> codeB = { 123 }
assert codeB.call() == 123

def isOdd = { int number -> number % 2 != 0 }
assert isOdd(1)
assert isOdd.call(1)

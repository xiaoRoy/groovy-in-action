package com.learn.groovyinaction.chap6

def argument = "given"
def standard = "default"
def result = argument ? argument : standard
assert result == "given"

def anotherResult = argument ?: standard
assert anotherResult == "given"

switch (10) {
    case 0: assert false; break
    case 0..9: assert false; break
    case [8, 9, 11]: assert false; break
    case Float: assert false; break
    case { number -> number % 3 == 0 }: assert false; break
    case { it % 3 == 0 }: assert false; break
    case ~/../: assert true; break
    default: assert false; break
}

def values = [1, 2, 3]
assert 2 in values

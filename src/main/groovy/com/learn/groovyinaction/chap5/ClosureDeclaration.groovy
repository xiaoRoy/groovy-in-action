package com.learn.groovyinaction.chap5

def logA = ''
(0..9).each { counter -> logA += counter }
assert logA == '0123456789'

def logB = ''
(0..9).each { logB += it }
assert logB == '0123456789'

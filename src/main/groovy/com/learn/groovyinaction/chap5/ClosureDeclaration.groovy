package com.learn.groovyinaction.chap5

def logA = ''
(0..9).each { counter -> logA += counter }
assert logA == '0123456789'

def logB = ''
(0..9).each { logB += it }
assert logB == '0123456789'


def printer = { line -> println line }

def Closure getPrinter () {
    return { line -> println line }
}

SizeFilter sizeFilterUpTo5 = new SizeFilter(limit: 5)
SizeFilter sizeFilterUpTo6 = new SizeFilter(limit: 6)
Closure sizeUpTo6 = sizeFilterUpTo6.&sizeUpTo
def words = ['long string', 'medium', 'short', 'tiny']
'short' == words.find { sizeFilterUpTo5.&sizeUpTo }
'medium' == words.find { sizeUpTo6 }

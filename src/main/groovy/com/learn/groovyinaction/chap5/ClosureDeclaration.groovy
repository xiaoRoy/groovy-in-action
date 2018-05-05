package com.learn.groovyinaction.chap5

import com.learn.groovyinaction.chap3.GStrings

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

SizeCalculator sizeCalculator = new SizeCalculator()
def calculator = sizeCalculator.&calculateSize
assert 4 == calculator('love')
assert 2 == calculator([1, 2])

def numberMap = ['a': 1, 'b': 2]
numberMap.each { key, value -> numberMap[key] = value * 2 }
assert numberMap == ['a': 2, 'b': 4]

Closure doubler = { String key, Integer value -> numberMap[key] = value * 2 }
numberMap.each(doubler)
assert numberMap == ['a': 4, 'b': 8]

def static doubleMethod (entry) {
    entry.value = entry.value * 2
}
doubler = this.&doubleMethod
numberMap.each(doubler)
assert numberMap == ['a': 8, 'b': 16]

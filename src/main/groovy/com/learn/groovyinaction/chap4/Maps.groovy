package com.learn.groovyinaction.chap4

def firstMap = [a:1, b:2, c:3]
assert firstMap instanceof LinkedHashMap
assert firstMap.size() == 3
assert firstMap['a'] == 1

def emptyMap = [:]
assert emptyMap.size() == 0

def treeMap = new TreeMap()
treeMap.putAll(firstMap)
assert treeMap['a'] == 1

def composedMap = [x:'x', *:firstMap]
assert composedMap == [x:'x', a:1, b:2, c:3]

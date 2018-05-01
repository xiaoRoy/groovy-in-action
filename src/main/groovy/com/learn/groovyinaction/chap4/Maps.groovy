package com.learn.groovyinaction.chap4

def firstMap = [a: 1, b: 2, c: 3]
assert firstMap instanceof LinkedHashMap
assert firstMap.size() == 3
assert firstMap['a'] == 1

def emptyMap = [:]
assert emptyMap.size() == 0

def treeMap = new TreeMap()
treeMap.putAll(firstMap)
assert treeMap['a'] == 1

def composedMap = [x: 'x', *: firstMap]
assert composedMap == [x: 'x', a: 1, b: 2, c: 3]

assert firstMap.a == 1
assert firstMap.get('a') == 1
assert firstMap.get('a', 0) == 1
assert firstMap.get('d') == null
assert firstMap.get('d', 0) == 0
firstMap['d'] = 4
assert firstMap.d == 4

def oneMap = ['a': 1, 'b': 2, 'c': 3]
assert oneMap.any { it.value > 2 }
assert oneMap.every { it.key < 'd' }
assert oneMap.values().toList() == [1, 2, 3]

def count = oneMap.inject(0) {
    sum, element -> sum += element.value
}
assert count == 6

def subMap = oneMap.subMap(['a', 'b'])
assert subMap.size() == 2
def largerThanTwo = oneMap.findAll { it.value >= 2 }
assert largerThanTwo.size() == 2

def addTo = []
oneMap.collect(addTo) {
    it.value * 2
}
assert addTo instanceof List
assert addTo.every { it % 2 == 0 }

def textCorpus = """
Look for the bare necessities
The simple bare necessities
Forget about your worries and your strife
I mean the bare necessities
Old Mother Nature's recipes
That bring the bare necessities of life
"""

def words = textCorpus.tokenize()
def wordsFrequency = [:]
words.each { word -> wordsFrequency[word] = wordsFrequency.get(word, 0) + 1 }
def wordList = wordsFrequency.keySet().toList()
wordList.sort { wordsFrequency[it] }

def statistic = "\n"

wordList[-1..-5].each { word ->
    statistic += word.padLeft(12) + ': '
    statistic += wordsFrequency.get(word) + "\n"
}
assert statistic == """
 necessities: 4
        bare: 4
         the: 3
        your: 2
        life: 1
"""

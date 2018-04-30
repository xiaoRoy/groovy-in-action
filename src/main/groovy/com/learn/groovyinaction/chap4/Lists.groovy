package com.learn.groovyinaction.chap4


List numbers = (1..3).toList()
assert numbers instanceof ArrayList

List empty = []
assert empty.size() == 0

LinkedList linkedList = new LinkedList(numbers)
assert linkedList.size() == 3

List alphabetic = ['a', 'b', 'c', 'd', 'e', 'f']
alphabetic[0..2] == ['a', 'b', 'c']
alphabetic[0, 2, 4] == ['a', 'c', 'e']

alphabetic[(Range) (0..2)] = ['x', 'y', 'z']
assert alphabetic == ['x', 'y', 'z', 'd', 'e', 'f']

List numberList = [0, 1, 2, 3, 4]
//when index is negative, size + index
assert numberList[-1] == 4

List list = []
list += 'a'
assert list == ['a']
list += ['b', 'c']
assert list == ['a', 'b', 'c']

list.clear()
list << 'a' << 'b'
assert list == ['a', 'b']

assert list - ['a'] == ['b']

assert list * 2 == ['a', 'b', 'a', 'b']

List controlList = ('a'..'c').toList()
assert controlList.isCase('b')
assert 'b' in controlList
def candidate = 'c'
switch (candidate) {
    case controlList: assert true; break
    default: assert false
}

assert ['z', 'a', 'y'].grep(controlList) == ['a']

if (empty) assert false

def expr = ''
[1, '*', 5].each {
    expr += it
}
assert expr == '1*5'

List shortList = [1, 2, 3]
assert shortList == [1, [2, 3]].flatten()
assert shortList.intersect((Iterable) [4, 3, 1]) == [3, 1]
assert shortList.disjoint([4, 5, 6])
def popped = shortList.pop()
assert popped == 3
assert [1, 2] == shortList

assert [1, 2].reverse() == [2, 1]
assert [3, 2, 1].sort() == [1, 2, 3]

def names = ["Tom", "Smith", "Apple"]
names.sort {
    one, another -> one <=> another
}
assert names == ['Apple', 'Smith', 'Tom']

def oneToThree = [1, 2, 3]
assert oneToThree.collect { it * 2 } == [2, 4, 6]
assert oneToThree.findAll { it % 2 == 0 } == [2]

def duplicated = [1, 1, 1]
assert duplicated.unique() == [1]

def withNull = [1, null, 3]
assert withNull.findAll() { it != null } == [1, 3]

List oneTwoThree = [1, 2, 3]
assert oneTwoThree.tail() == [2, 3]
def even = oneTwoThree.find { it % 2 == 0 }
assert even == 2
assert oneTwoThree.any { it > 2 }
assert oneTwoThree.every { it < 5 }
def log = ''
oneTwoThree.eachWithIndex{ element, index -> log += "$index:$element "}
assert log == '0:1 1:2 2:3 '

def result = oneTwoThree.inject(0) {
    int sum, int element -> sum + element
}
assert result == 6

def factorial = (1..5).toList().inject(1) {
    int fac, int element -> fac * element
}
assert factorial == 120

def quickSort (List<Integer> list) {
    if (list.size() < 2) return list
    def pivot = list[list.size().intdiv(2).toInteger()]
    def left = list.findAll { it < pivot }
    def middle = list.findAll{it == pivot}
    def right = list.findAll { it > pivot }
    return quickSort(left) + middle + quickSort(right)
}

assert [1] == quickSort([1])
assert [1, 2] == quickSort([2, 1])
assert quickSort([3,1,2,2]) == [1, 2, 2, 3]

def urls = [
        new URL('http', 'myshop.com', 80, 'index.html'),
        new URL('https', 'myshop.com', 443, 'buynow.html'),
        new URL('ftp', 'myshop.com', 21, 'downloads')
]

assert urls
        .findAll{it.port < 99}
        .collect{it.file.toUpperCase()}
        .sort()
        .join(', ') == 'DOWNLOADS, INDEX.HTML'

package com.learn.groovyinaction.chap4


List numbers = (1..3).toList()
assert numbers instanceof ArrayList

List empty = []
assert empty.size() == 0

LinkedList linkedList = new LinkedList(numbers)
assert linkedList.size() == 3

List alphabetic = ['a','b','c','d','e','f']
alphabetic[0..2] == ['a', 'b', 'c']
alphabetic[0, 2, 4] == ['a', 'c', 'e']

alphabetic[(Range) (0..2)] = ['x', 'y', 'z']
assert alphabetic == ['x', 'y', 'z','d','e','f']

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
switch (candidate){
    case controlList: assert true;break
    default:assert false
}

assert ['z', 'a', 'y'].grep(controlList) == ['a']

if(empty) assert false

def expr = ''
[1, '*', 5].each {
    expr += it
}
assert expr == '1*5'

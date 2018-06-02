package com.learn.groovyinaction.chap6

assert true
assert !false

assert ('a' =~ /./)
assert !('a' =~ /b/)

assert [1]
assert ![]

Iterator iterator = [1].iterator()
assert iterator
iterator.next()
assert !iterator

assert ['a': 1]
assert ![:]

assert 'a'
assert !''

assert 1
assert 1.1

assert ! null
assert new Object()

assert ! new AlwaysFalse()

/*
* if(x = 2){
*   print x //compiler error
* }
* */

def x = 1
if((x = 3)){
    assert  x == 3
}

def store = []
while(x = x -1){
    store << x
}
assert store == [2, 1]

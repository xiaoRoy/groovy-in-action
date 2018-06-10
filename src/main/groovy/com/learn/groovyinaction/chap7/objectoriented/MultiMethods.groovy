package com.learn.groovyinaction.chap7.objectoriented

def oracle(Object object){
    'object'
}

def oracle(String string){
    'string'
}

Object first = 1;
Object second = 'foo'
assert 'object' == oracle(first)
/*
* In Java the oracle(second) will dispatch to oracle(Object object),
* but Groovy dispatches by the runtime type, so oracle(String string) gets called.
* */
assert 'string' == oracle(second)

Object same = new Equalizer()
Object other = new Object()
assert new Equalizer().equals(same)
assert !new Equalizer().equals(other)

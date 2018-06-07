package com.learn.groovyinaction.chap7

import com.learn.groovyinaction.chap7.FieldShowcase

def scriptLocalVar = 1
boundVar = 2

def scriptMethod () {
    def scriptMethodLocalVar = 1
    scriptMehotBoundvar = 2
}


def counter = new Counter()
assert counter.count == 1

def fieldName = 'count'
counter[fieldName] = 2
assert counter['count'] == 2

def pretender = new PretendFieldCounter()
assert pretender.isNoField == 'pretend value'
assert pretender.count == 0
pretender.isNoFieldNeither = 'just to increase counter'
assert pretender.count == 1

def map = [a: [b: [c: 1]]]
assert map.a.b.c == 1
if(map && map.a && map.a.x){
    assert map.a.x.c == null
}
try{
    assert map.a.x.c == null
}catch (NullPointerException exception){
    print exception.message
}

assert map?.a?.x?.c == null

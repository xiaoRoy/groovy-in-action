package com.learn.groovyinaction.chap7.groovybean

def beanShowcase = new BeanShowcase()
assert beanShowcase.assigned == 'default value'
beanShowcase.setUntyped 'some value'
assert beanShowcase.untyped == 'some value'
def anotherBean = new BeanShowcase(typed: 'another value')
anotherBean.typed == 'another value'

def studentA = new Student(firstName: "Roy", lastName: "Smith")
assert studentA.name == "Roy Smith"


def doublerBean = new DoublerBean(value: 100)
assert doublerBean.value == 200
assert doublerBean.@value == 100

package com.learn.tutorial.closure

import com.learn.tutorial.closure.model.Dog
import com.learn.tutorial.closure.model.Person

def enclosing = new Enclosing()
enclosing.thisRun()
enclosing.ownerRun()
enclosing.delegateRun()

def enclosedInInnerClass = new EnclosedInInnerClass()
enclosedInInnerClass.thisRun()
enclosedInInnerClass.ownerRun()

def nestedClosure = new NestedClosure()
nestedClosure.thisRun()
nestedClosure.ownerRun()

def smith = new Person(name: 'Smith')
def dog = new Dog(name: "dog")
def upperCasedName = { delegate.name.toUpperCase() }
upperCasedName.delegate = smith
assert upperCasedName() == 'SMITH'
upperCasedName.delegate = dog
assert upperCasedName() == 'DOG'

def someone = new Person(name: 'Tom')
def upperCaseClosure = { name.toUpperCase() }
upperCaseClosure.delegate = someone
assert upperCaseClosure() == 'TOM'

/*def closureA = { println 'hello,  groovy'}
closureA.call(1)*/

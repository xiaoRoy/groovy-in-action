package com.learn.tutorial.closure

def enclosing = new Enclosing()
enclosing.thisRun()
enclosing.ownerRun()

def enclosedInInnerClass = new EnclosedInInnerClass()
enclosedInInnerClass.thisRun()
enclosedInInnerClass.ownerRun()

def nestedClosure = new NestedClosure()
nestedClosure.thisRun()
nestedClosure.ownerRun()

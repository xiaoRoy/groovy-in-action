package com.learn.groovyinaction.chap5

def adder = { one, another -> return one + another }
assert adder(3, 4) == 7
assert adder.call(3, 4) == 7

def static benchmark (int repeat, Closure worker) {
    def start = System.nanoTime()
    repeat.times(worker)
    def stop = System.nanoTime()
    return stop - start
}

def slow = benchmark(10000) { (int) it / 2 }
def fast = benchmark(10000) { int number -> number.intdiv(2) }
assert fast < slow

def adderB = { one, another = 3 -> one + another }
assert adderB(1) == 4
assert adderB.call(1, 5) == 6


def static numOfParams (Closure closure) {
    closure.maximumNumberOfParameters
}

assert numOfParams(adder) == 2
assert numOfParams { one -> } == 1

def static paramType (Closure closure) {
    closure.getParameterTypes()
}

assert paramType { String text -> } == [String]
assert paramType { Number number, String text -> } == [Number, String]

def mult = { one, another -> one * another }
def twoTimes = mult.curry(2)
assert twoTimes(5) == 10
def twoTimesB = { another -> mult(2, another) }
assert twoTimesB(6) == 12
def twoTimesC = { another -> mult 2, another}
assert twoTimesC.call(7) == 14

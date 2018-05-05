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
assert fast * 2 < slow

def adderB = { one, another = 3 -> one + another }
assert adderB(1) == 4
assert adderB.call(1, 5) == 6
